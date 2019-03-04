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
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, PrefixFilter],
    cacheKey: js.Function1[java.lang.String, PrefixFilter],
    field: js.Function1[java.lang.String, PrefixFilter],
    name: js.Function1[java.lang.String, PrefixFilter],
    prefix: js.Function1[java.lang.String, PrefixFilter],
    toJSON: js.Function0[PrefixFilter]
  ): PrefixFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, field = field, name = name, prefix = prefix, toJSON = toJSON)
  
    __obj.asInstanceOf[PrefixFilter]
  }
}

