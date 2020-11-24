package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "OrFilter")
@js.native
class OrFilter protected () extends Filter {
  def this(filters: js.Array[Filter]) = this()
  /*
    A container Filter that allows Boolean OR composition of filters.
    */
  def this(filters: Filter) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): OrFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): OrFilter = js.native
  
  def filters(fltr: js.Array[Filter]): OrFilter = js.native
  /*
    Updates the filters.  If passed a single Filter it is added to
    the existing filters.  If passed an array of Filters, they
    replace all existing Filters.
    */
  def filters(fltr: Filter): OrFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): OrFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): OrFilter = js.native
}
