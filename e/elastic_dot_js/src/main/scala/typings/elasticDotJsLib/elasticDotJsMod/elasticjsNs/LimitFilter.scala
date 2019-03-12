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
    _type: () => java.lang.String,
    cache: scala.Boolean => LimitFilter,
    cacheKey: java.lang.String => LimitFilter,
    name: java.lang.String => LimitFilter,
    toJSON: () => LimitFilter,
    value: scala.Double => LimitFilter
  ): LimitFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[LimitFilter]
  }
}

