package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoDistanceFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): GeoDistanceFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): GeoDistanceFilter
  /*
    Sets the numeric distance to be used.  The distance can be a
    numeric value, and then the unit (either mi or km can be set)
    controlling the unit. Or a single string with the unit as well.
    */
  def distance(numericDistance: stdLib.Number): GeoDistanceFilter
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  def distanceType(`type`: java.lang.String): GeoDistanceFilter
  /*
    Sets the fields to filter against.
    */
  def field(f: java.lang.String): GeoDistanceFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): GeoDistanceFilter
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: java.lang.String): GeoDistanceFilter
  /*
    Will an optimization of using first a bounding box check will be
    used. Defaults to memory which will do in memory checks. Can also
    have values of indexed to use indexed value check, or none which
    disables bounding box optimization.
    */
  def optimizeBbox(t: java.lang.String): GeoDistanceFilter
  /*
    Sets the point of origin in which distance will be measured from
    */
  def point(p: GeoPoint): GeoDistanceFilter
  /*
    Returns the filter object.
    */
  def toJSON(): GeoDistanceFilter
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  def unit(unit: java.lang.String): GeoDistanceFilter
}

object GeoDistanceFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, GeoDistanceFilter],
    cacheKey: js.Function1[java.lang.String, GeoDistanceFilter],
    distance: js.Function1[stdLib.Number, GeoDistanceFilter],
    distanceType: js.Function1[java.lang.String, GeoDistanceFilter],
    field: js.Function1[java.lang.String, GeoDistanceFilter],
    name: js.Function1[java.lang.String, GeoDistanceFilter],
    normalize: js.Function1[java.lang.String, GeoDistanceFilter],
    optimizeBbox: js.Function1[java.lang.String, GeoDistanceFilter],
    point: js.Function1[GeoPoint, GeoDistanceFilter],
    toJSON: js.Function0[GeoDistanceFilter],
    unit: js.Function1[java.lang.String, GeoDistanceFilter]
  ): GeoDistanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("distanceType")(distanceType)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("optimizeBbox")(optimizeBbox)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[GeoDistanceFilter]
  }
}

