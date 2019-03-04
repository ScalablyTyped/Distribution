package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): RangeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): RangeFilter
  /*
    The field to run the filter against.
    */
  def field(f: java.lang.String): RangeFilter
  /*
    The lower bound. Defaults to start from the first.
    */
  def from(f: js.Any): RangeFilter
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: js.Any): RangeFilter
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: js.Any): RangeFilter
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: scala.Boolean): RangeFilter
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: scala.Boolean): RangeFilter
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: js.Any): RangeFilter
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: js.Any): RangeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): RangeFilter
  /*
    The upper bound. Defaults to unbounded.
    */
  def to(t: js.Any): RangeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): RangeFilter
}

object RangeFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, RangeFilter],
    cacheKey: js.Function1[java.lang.String, RangeFilter],
    field: js.Function1[java.lang.String, RangeFilter],
    from: js.Function1[js.Any, RangeFilter],
    gt: js.Function1[js.Any, RangeFilter],
    gte: js.Function1[js.Any, RangeFilter],
    includeLower: js.Function1[scala.Boolean, RangeFilter],
    includeUpper: js.Function1[scala.Boolean, RangeFilter],
    lt: js.Function1[js.Any, RangeFilter],
    lte: js.Function1[js.Any, RangeFilter],
    name: js.Function1[java.lang.String, RangeFilter],
    to: js.Function1[js.Any, RangeFilter],
    toJSON: js.Function0[RangeFilter]
  ): RangeFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, field = field, from = from, gt = gt, gte = gte, includeLower = includeLower, includeUpper = includeUpper, lt = lt, lte = lte, name = name, to = to, toJSON = toJSON)
  
    __obj.asInstanceOf[RangeFilter]
  }
}

