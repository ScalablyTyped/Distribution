package typings.elasticJs.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoDistanceRangeFilter")
@js.native
class GeoDistanceRangeFilter protected () extends Filter {
  /*
    Filter results to those which fall within the given distance range of the point of origin.
    */
  def this(fieldName: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): GeoDistanceRangeFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): GeoDistanceRangeFilter = js.native
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  def distanceType(`type`: String): GeoDistanceRangeFilter = js.native
  /*
    Sets the fields to filter against.
    */
  def field(f: String): GeoDistanceRangeFilter = js.native
  /*
    Sets the start point of the distance range
    */
  def from(numericDistance: Number): GeoDistanceRangeFilter = js.native
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: Number): GeoDistanceRangeFilter = js.native
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: Number): GeoDistanceRangeFilter = js.native
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: Boolean): GeoDistanceRangeFilter = js.native
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: Boolean): GeoDistanceRangeFilter = js.native
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: Number): GeoDistanceRangeFilter = js.native
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: Number): GeoDistanceRangeFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): GeoDistanceRangeFilter = js.native
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: String): GeoDistanceRangeFilter = js.native
  /*
    Will an optimization of using first a bounding box check will be
    used. Defaults to memory which will do in memory checks. Can also
    have values of indexed to use indexed value check, or none which
    disables bounding box optimization.
    */
  def optimizeBbox(t: String): GeoDistanceRangeFilter = js.native
  /*
    Sets the point of origin in which distance will be measured from
    */
  def point(p: GeoPoint): GeoDistanceRangeFilter = js.native
  /*
    Sets the end point of the distance range
    */
  def to(numericDistance: Number): GeoDistanceRangeFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): GeoDistanceRangeFilter = js.native
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  def unit(unit: String): GeoDistanceRangeFilter = js.native
}

