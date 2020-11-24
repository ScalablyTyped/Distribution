package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "TypeFilter")
@js.native
class TypeFilter protected () extends Filter {
  /*
    Filter results by a specified index type.
    */
  def this(`type`: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): TypeFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): TypeFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): TypeFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): TypeFilter = js.native
  
  /*
    Sets the type
    */
  def `type`(`type`: String): TypeFilter = js.native
}
