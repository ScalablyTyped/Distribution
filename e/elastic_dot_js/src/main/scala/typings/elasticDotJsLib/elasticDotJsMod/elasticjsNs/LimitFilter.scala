package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): LimitFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): LimitFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): LimitFilter
  /*
    Returns the filter object.
    */
  def toJSON(): LimitFilter
  /*
    Sets the limit value.
    */
  def value(`val`: scala.Double): LimitFilter
}

object LimitFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, LimitFilter],
    cacheKey: js.Function1[java.lang.String, LimitFilter],
    name: js.Function1[java.lang.String, LimitFilter],
    toJSON: js.Function0[LimitFilter],
    value: js.Function1[scala.Double, LimitFilter]
  ): LimitFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LimitFilter]
  }
}

