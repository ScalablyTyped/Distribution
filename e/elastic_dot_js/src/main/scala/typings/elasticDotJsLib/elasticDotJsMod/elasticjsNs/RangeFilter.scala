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
    _type: () => java.lang.String,
    cache: scala.Boolean => RangeFilter,
    cacheKey: java.lang.String => RangeFilter,
    field: java.lang.String => RangeFilter,
    from: js.Any => RangeFilter,
    gt: js.Any => RangeFilter,
    gte: js.Any => RangeFilter,
    includeLower: scala.Boolean => RangeFilter,
    includeUpper: scala.Boolean => RangeFilter,
    lt: js.Any => RangeFilter,
    lte: js.Any => RangeFilter,
    name: java.lang.String => RangeFilter,
    to: js.Any => RangeFilter,
    toJSON: () => RangeFilter
  ): RangeFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), field = js.Any.fromFunction1(field), from = js.Any.fromFunction1(from), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), includeLower = js.Any.fromFunction1(includeLower), includeUpper = js.Any.fromFunction1(includeUpper), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), name = js.Any.fromFunction1(name), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RangeFilter]
  }
}

