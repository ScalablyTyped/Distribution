package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "AndFilter")
@js.native
open class AndFilter protected ()
  extends StObject
     with Filter {
  def this(f: js.Array[Filter]) = this()
  /*
    A container Filter that allows Boolean AND composition of Filters.
    */
  def this(f: Filter) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): AndFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): AndFilter = js.native
  
  def filters(fltr: js.Array[Filter]): AndFilter = js.native
  /*
    Sets the filters for the filter.  If fltr is a single
    Filter, it is added to the current filters.  If fltr is an array
    of Filters, then they replace all existing filters.
    */
  def filters(fltr: Filter): AndFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): AndFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): AndFilter = js.native
}
