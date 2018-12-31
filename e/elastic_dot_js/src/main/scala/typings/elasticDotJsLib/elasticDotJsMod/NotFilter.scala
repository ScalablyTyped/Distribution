package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "NotFilter")
@js.native
class NotFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.NotFilter {
  /*
    Container filter that excludes the matched documents of the contained filter.
    */
  def this(oFilter: js.Object) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NotFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NotFilter = js.native
  /*
    Sets the filter
    */
  /* CompleteClass */
  override def filter(fltr: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NotFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NotFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.NotFilter = js.native
}

