package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "ExistsFilter")
@js.native
open class ExistsFilter protected ()
  extends StObject
     with Filter {
  /*
    Filters documents where a specified field exists and contains a value.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): ExistsFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): ExistsFilter = js.native
  
  /*
    Sets the field to check for missing values.
    */
  def field(name: String): ExistsFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): ExistsFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): ExistsFilter = js.native
}
