package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoDistanceRangeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): GeoDistanceRangeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): GeoDistanceRangeFilter
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  def distanceType(`type`: java.lang.String): GeoDistanceRangeFilter
  /*
    Sets the fields to filter against.
    */
  def field(f: java.lang.String): GeoDistanceRangeFilter
  /*
    Sets the start point of the distance range
    */
  def from(numericDistance: stdLib.Number): GeoDistanceRangeFilter
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: stdLib.Number): GeoDistanceRangeFilter
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: stdLib.Number): GeoDistanceRangeFilter
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: scala.Boolean): GeoDistanceRangeFilter
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: scala.Boolean): GeoDistanceRangeFilter
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: stdLib.Number): GeoDistanceRangeFilter
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: stdLib.Number): GeoDistanceRangeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): GeoDistanceRangeFilter
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: java.lang.String): GeoDistanceRangeFilter
  /*
    Will an optimization of using first a bounding box check will be
    used. Defaults to memory which will do in memory checks. Can also
    have values of indexed to use indexed value check, or none which
    disables bounding box optimization.
    */
  def optimizeBbox(t: java.lang.String): GeoDistanceRangeFilter
  /*
    Sets the point of origin in which distance will be measured from
    */
  def point(p: GeoPoint): GeoDistanceRangeFilter
  /*
    Sets the end point of the distance range
    */
  def to(numericDistance: stdLib.Number): GeoDistanceRangeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): GeoDistanceRangeFilter
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  def unit(unit: java.lang.String): GeoDistanceRangeFilter
}

object GeoDistanceRangeFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => GeoDistanceRangeFilter,
    cacheKey: java.lang.String => GeoDistanceRangeFilter,
    distanceType: java.lang.String => GeoDistanceRangeFilter,
    field: java.lang.String => GeoDistanceRangeFilter,
    from: stdLib.Number => GeoDistanceRangeFilter,
    gt: stdLib.Number => GeoDistanceRangeFilter,
    gte: stdLib.Number => GeoDistanceRangeFilter,
    includeLower: scala.Boolean => GeoDistanceRangeFilter,
    includeUpper: scala.Boolean => GeoDistanceRangeFilter,
    lt: stdLib.Number => GeoDistanceRangeFilter,
    lte: stdLib.Number => GeoDistanceRangeFilter,
    name: java.lang.String => GeoDistanceRangeFilter,
    normalize: java.lang.String => GeoDistanceRangeFilter,
    optimizeBbox: java.lang.String => GeoDistanceRangeFilter,
    point: GeoPoint => GeoDistanceRangeFilter,
    to: stdLib.Number => GeoDistanceRangeFilter,
    toJSON: () => GeoDistanceRangeFilter,
    unit: java.lang.String => GeoDistanceRangeFilter
  ): GeoDistanceRangeFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), distanceType = js.Any.fromFunction1(distanceType), field = js.Any.fromFunction1(field), from = js.Any.fromFunction1(from), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), includeLower = js.Any.fromFunction1(includeLower), includeUpper = js.Any.fromFunction1(includeUpper), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), name = js.Any.fromFunction1(name), normalize = js.Any.fromFunction1(normalize), optimizeBbox = js.Any.fromFunction1(optimizeBbox), point = js.Any.fromFunction1(point), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), unit = js.Any.fromFunction1(unit))
  
    __obj.asInstanceOf[GeoDistanceRangeFilter]
  }
}

