package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMixin extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): FilterMixin
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): FilterMixin
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): FilterMixin
  /*
    Returns the filter object.
    */
  def toJSON(): FilterMixin
}

object FilterMixin {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => FilterMixin,
    cacheKey: java.lang.String => FilterMixin,
    name: java.lang.String => FilterMixin,
    toJSON: () => FilterMixin
  ): FilterMixin = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[FilterMixin]
  }
}

