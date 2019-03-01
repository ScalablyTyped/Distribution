package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchAllFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): MatchAllFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): MatchAllFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): MatchAllFilter
  /*
    Returns the filter object.
    */
  def toJSON(): MatchAllFilter
}

object MatchAllFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, MatchAllFilter],
    cacheKey: js.Function1[java.lang.String, MatchAllFilter],
    name: js.Function1[java.lang.String, MatchAllFilter],
    toJSON: js.Function0[MatchAllFilter]
  ): MatchAllFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[MatchAllFilter]
  }
}

