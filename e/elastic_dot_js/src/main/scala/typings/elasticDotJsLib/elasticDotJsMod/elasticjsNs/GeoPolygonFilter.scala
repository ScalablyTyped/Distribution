package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPolygonFilter extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): GeoPolygonFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): GeoPolygonFilter
  /*
    Sets the fields to filter against.
    */
  def field(f: java.lang.String): GeoPolygonFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): GeoPolygonFilter
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: java.lang.String): GeoPolygonFilter
  /*
    Sets a series of points that represent a polygon.  If passed a
    single GeoPoint object, it is added to the current
    list of points.  If passed an array of GeoPoint
    objects it replaces all current values.
    */
  def points(pointsArray: js.Array[_]): GeoPolygonFilter
  /*
    Returns the filter object.
    */
  def toJSON(): GeoPolygonFilter
}

object GeoPolygonFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => GeoPolygonFilter,
    cacheKey: java.lang.String => GeoPolygonFilter,
    field: java.lang.String => GeoPolygonFilter,
    name: java.lang.String => GeoPolygonFilter,
    normalize: java.lang.String => GeoPolygonFilter,
    points: js.Array[_] => GeoPolygonFilter,
    toJSON: () => GeoPolygonFilter
  ): GeoPolygonFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), field = js.Any.fromFunction1(field), name = js.Any.fromFunction1(name), normalize = js.Any.fromFunction1(normalize), points = js.Any.fromFunction1(points), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[GeoPolygonFilter]
  }
}

