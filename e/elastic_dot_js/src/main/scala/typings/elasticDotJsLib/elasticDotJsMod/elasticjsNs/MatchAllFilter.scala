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
    _type: () => java.lang.String,
    cache: scala.Boolean => MatchAllFilter,
    cacheKey: java.lang.String => MatchAllFilter,
    name: java.lang.String => MatchAllFilter,
    toJSON: () => MatchAllFilter
  ): MatchAllFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MatchAllFilter]
  }
}

