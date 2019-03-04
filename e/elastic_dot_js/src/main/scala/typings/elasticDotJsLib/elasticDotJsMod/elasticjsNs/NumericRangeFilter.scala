package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericRangeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): NumericRangeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): NumericRangeFilter
  /*
    Returns the field name used to create this object.
    */
  def field(field: java.lang.String): NumericRangeFilter
  /*
    Sets the endpoint for the current range.
    */
  def from(startPoint: stdLib.Number): NumericRangeFilter
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: js.Any): NumericRangeFilter
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: js.Any): NumericRangeFilter
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: scala.Boolean): NumericRangeFilter
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: scala.Boolean): NumericRangeFilter
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: js.Any): NumericRangeFilter
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: js.Any): NumericRangeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): NumericRangeFilter
  /*
    Sets the endpoint for the current range.
    */
  def to(endPoint: stdLib.Number): NumericRangeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): NumericRangeFilter
}

object NumericRangeFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, NumericRangeFilter],
    cacheKey: js.Function1[java.lang.String, NumericRangeFilter],
    field: js.Function1[java.lang.String, NumericRangeFilter],
    from: js.Function1[stdLib.Number, NumericRangeFilter],
    gt: js.Function1[js.Any, NumericRangeFilter],
    gte: js.Function1[js.Any, NumericRangeFilter],
    includeLower: js.Function1[scala.Boolean, NumericRangeFilter],
    includeUpper: js.Function1[scala.Boolean, NumericRangeFilter],
    lt: js.Function1[js.Any, NumericRangeFilter],
    lte: js.Function1[js.Any, NumericRangeFilter],
    name: js.Function1[java.lang.String, NumericRangeFilter],
    to: js.Function1[stdLib.Number, NumericRangeFilter],
    toJSON: js.Function0[NumericRangeFilter]
  ): NumericRangeFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, field = field, from = from, gt = gt, gte = gte, includeLower = includeLower, includeUpper = includeUpper, lt = lt, lte = lte, name = name, to = to, toJSON = toJSON)
  
    __obj.asInstanceOf[NumericRangeFilter]
  }
}

