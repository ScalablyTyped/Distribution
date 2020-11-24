package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "NotFilter")
@js.native
class NotFilter protected () extends Filter {
  /*
    Container filter that excludes the matched documents of the contained filter.
    */
  def this(oFilter: js.Object) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): NotFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): NotFilter = js.native
  
  /*
    Sets the filter
    */
  def filter(fltr: js.Object): NotFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): NotFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): NotFilter = js.native
}
