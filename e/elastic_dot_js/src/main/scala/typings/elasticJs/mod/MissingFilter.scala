package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "MissingFilter")
@js.native
class MissingFilter protected () extends Filter {
  /*
    Filters documents where a specific field has no value present.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): MissingFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): MissingFilter = js.native
  
  /*
    Checks if the field doesn't exist.
    */
  def existence(trueFalse: Boolean): MissingFilter = js.native
  
  /*
    Sets the field to check for missing values.
    */
  def field(name: String): MissingFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): MissingFilter = js.native
  
  /*
    Checks if the field has null values.
    */
  def nullValue(trueFalse: Boolean): MissingFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): MissingFilter = js.native
}
