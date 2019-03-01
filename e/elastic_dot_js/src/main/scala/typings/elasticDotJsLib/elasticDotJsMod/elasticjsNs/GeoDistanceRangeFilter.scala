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
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, GeoDistanceRangeFilter],
    cacheKey: js.Function1[java.lang.String, GeoDistanceRangeFilter],
    distanceType: js.Function1[java.lang.String, GeoDistanceRangeFilter],
    field: js.Function1[java.lang.String, GeoDistanceRangeFilter],
    from: js.Function1[stdLib.Number, GeoDistanceRangeFilter],
    gt: js.Function1[stdLib.Number, GeoDistanceRangeFilter],
    gte: js.Function1[stdLib.Number, GeoDistanceRangeFilter],
    includeLower: js.Function1[scala.Boolean, GeoDistanceRangeFilter],
    includeUpper: js.Function1[scala.Boolean, GeoDistanceRangeFilter],
    lt: js.Function1[stdLib.Number, GeoDistanceRangeFilter],
    lte: js.Function1[stdLib.Number, GeoDistanceRangeFilter],
    name: js.Function1[java.lang.String, GeoDistanceRangeFilter],
    normalize: js.Function1[java.lang.String, GeoDistanceRangeFilter],
    optimizeBbox: js.Function1[java.lang.String, GeoDistanceRangeFilter],
    point: js.Function1[GeoPoint, GeoDistanceRangeFilter],
    to: js.Function1[stdLib.Number, GeoDistanceRangeFilter],
    toJSON: js.Function0[GeoDistanceRangeFilter],
    unit: js.Function1[java.lang.String, GeoDistanceRangeFilter]
  ): GeoDistanceRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("distanceType")(distanceType)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("gt")(gt)
    __obj.updateDynamic("gte")(gte)
    __obj.updateDynamic("includeLower")(includeLower)
    __obj.updateDynamic("includeUpper")(includeUpper)
    __obj.updateDynamic("lt")(lt)
    __obj.updateDynamic("lte")(lte)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("optimizeBbox")(optimizeBbox)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[GeoDistanceRangeFilter]
  }
}

