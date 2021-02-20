package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "LimitFilter")
@js.native
class LimitFilter protected () extends Filter {
  /*
    Limits the number of documents to execute on.
    */
  def this(limit: Double) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): LimitFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): LimitFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): LimitFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): LimitFilter = js.native
  
  /*
    Sets the limit value.
    */
  def value(`val`: Double): LimitFilter = js.native
}
