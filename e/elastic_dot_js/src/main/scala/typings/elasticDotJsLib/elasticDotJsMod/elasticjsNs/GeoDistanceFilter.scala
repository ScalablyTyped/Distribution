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

