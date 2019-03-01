package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TypeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TypeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TypeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): TypeFilter
  /*
    Sets the type
    */
  def `type`(`type`: java.lang.String): TypeFilter
}

object TypeFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, TypeFilter],
    cacheKey: js.Function1[java.lang.String, TypeFilter],
    name: js.Function1[java.lang.String, TypeFilter],
    toJSON: js.Function0[TypeFilter],
    `type`: js.Function1[java.lang.String, TypeFilter]
  ): TypeFilter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[TypeFilter]
  }
}

