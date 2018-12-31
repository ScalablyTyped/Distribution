package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MissingFilter")
@js.native
class MissingFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter {
  /*
    Filters documents where a specific field has no value present.
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
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
  /*
    Checks if the field doesn't exist.
    */
  /* CompleteClass */
  override def existence(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
  /*
    Sets the field to check for missing values.
    */
  /* CompleteClass */
  override def field(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
  /*
    Checks if the field has null values.
    */
  /* CompleteClass */
  override def nullValue(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.MissingFilter = js.native
}

