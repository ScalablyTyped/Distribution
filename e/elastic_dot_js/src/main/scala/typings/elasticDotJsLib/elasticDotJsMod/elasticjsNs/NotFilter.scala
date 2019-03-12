package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): NotFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): NotFilter
  /*
    Sets the filter
    */
  def filter(fltr: js.Object): NotFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): NotFilter
  /*
    Returns the filter object.
    */
  def toJSON(): NotFilter
}

object NotFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => NotFilter,
    cacheKey: java.lang.String => NotFilter,
    filter: js.Object => NotFilter,
    name: java.lang.String => NotFilter,
    toJSON: () => NotFilter
  ): NotFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), filter = js.Any.fromFunction1(filter), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[NotFilter]
  }
}

