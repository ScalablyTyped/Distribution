package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "PrefixFilter")
@js.native
class PrefixFilter protected () extends Filter {
  /*
    Filters documents that have fields containing terms with a specified prefix.
    */
  def this(fieldName: String, prefix: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): PrefixFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): PrefixFilter = js.native
  
  /*
    Returns the field name used to create this object.
    */
  def field(field: String): PrefixFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): PrefixFilter = js.native
  
  /*
    Sets the prefix to search for.
    */
  def prefix(value: String): PrefixFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): PrefixFilter = js.native
}
