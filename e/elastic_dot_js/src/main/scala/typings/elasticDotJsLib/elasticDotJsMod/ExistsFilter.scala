package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ExistsFilter")
@js.native
class ExistsFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExistsFilter {
  /*
    Filters documents where a specified field exists and contains a value.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExistsFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExistsFilter = js.native
  /*
    Sets the field to check for missing values.
    */
  /* CompleteClass */
  override def field(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExistsFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExistsFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ExistsFilter = js.native
}

