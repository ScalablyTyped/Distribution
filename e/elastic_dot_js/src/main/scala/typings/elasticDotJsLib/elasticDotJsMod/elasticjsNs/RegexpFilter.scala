package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexpFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): RegexpFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): RegexpFilter
  /*
    The field to run the filter against.
    */
  def field(f: java.lang.String): RegexpFilter
  /*
    The regex flags to use.  Valid flags are:
    INTERSECTION - Support for intersection notation
    COMPLEMENT - Support for complement notation
    EMPTY - Support for the empty language symbol: #
    ANYSTRING - Support for the any string symbol: @
    INTERVAL - Support for numerical interval notation:
    NONE - Disable support for all syntax options
    ALL - Enables support for all syntax options
    Use multiple flags by separating with a "|" character.  Example:
    INTERSECTION|COMPLEMENT|EMPTY
    */
  def flags(f: java.lang.String): RegexpFilter
  /*
    The regex flags to use as a numeric value.  Advanced use only,
    it is probably better to stick with the flags option.
    */
  def flagsValue(v: java.lang.String): RegexpFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): RegexpFilter
  /*
    Returns the filter object.
    */
  def toJSON(): RegexpFilter
  /*
    The regexp value.
    */
  def value(p: java.lang.String): RegexpFilter
}

object RegexpFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => RegexpFilter,
    cacheKey: java.lang.String => RegexpFilter,
    field: java.lang.String => RegexpFilter,
    flags: java.lang.String => RegexpFilter,
    flagsValue: java.lang.String => RegexpFilter,
    name: java.lang.String => RegexpFilter,
    toJSON: () => RegexpFilter,
    value: java.lang.String => RegexpFilter
  ): RegexpFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), field = js.Any.fromFunction1(field), flags = js.Any.fromFunction1(flags), flagsValue = js.Any.fromFunction1(flagsValue), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[RegexpFilter]
  }
}

