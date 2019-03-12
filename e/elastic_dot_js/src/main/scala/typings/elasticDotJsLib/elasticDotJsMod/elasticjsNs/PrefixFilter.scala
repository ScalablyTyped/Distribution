package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): PrefixFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): PrefixFilter
  /*
    Returns the field name used to create this object.
    */
  def field(field: java.lang.String): PrefixFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): PrefixFilter
  /*
    Sets the prefix to search for.
    */
  def prefix(value: java.lang.String): PrefixFilter
  /*
    Returns the filter object.
    */
  def toJSON(): PrefixFilter
}

object PrefixFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => PrefixFilter,
    cacheKey: java.lang.String => PrefixFilter,
    field: java.lang.String => PrefixFilter,
    name: java.lang.String => PrefixFilter,
    prefix: java.lang.String => PrefixFilter,
    toJSON: () => PrefixFilter
  ): PrefixFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), field = js.Any.fromFunction1(field), name = js.Any.fromFunction1(name), prefix = js.Any.fromFunction1(prefix), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[PrefixFilter]
  }
}

