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
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, NotFilter],
    cacheKey: js.Function1[java.lang.String, NotFilter],
    filter: js.Function1[js.Object, NotFilter],
    name: js.Function1[java.lang.String, NotFilter],
    toJSON: js.Function0[NotFilter]
  ): NotFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, filter = filter, name = name, toJSON = toJSON)
  
    __obj.asInstanceOf[NotFilter]
  }
}

