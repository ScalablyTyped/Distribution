package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistsFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): ExistsFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): ExistsFilter
  /*
    Sets the field to check for missing values.
    */
  def field(name: java.lang.String): ExistsFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): ExistsFilter
  /*
    Returns the filter object.
    */
  def toJSON(): ExistsFilter
}

object ExistsFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => ExistsFilter,
    cacheKey: java.lang.String => ExistsFilter,
    field: java.lang.String => ExistsFilter,
    name: java.lang.String => ExistsFilter,
    toJSON: () => ExistsFilter
  ): ExistsFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), field = js.Any.fromFunction1(field), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ExistsFilter]
  }
}

