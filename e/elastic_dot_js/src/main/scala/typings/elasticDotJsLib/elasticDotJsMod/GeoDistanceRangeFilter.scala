package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoDistanceRangeFilter")
@js.native
class GeoDistanceRangeFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter {
  /*
    Filter results to those which fall within the given distance range of the point of origin.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  /* CompleteClass */
  override def distanceType(`type`: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the fields to filter against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the start point of the distance range
    */
  /* CompleteClass */
  override def from(numericDistance: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  /* CompleteClass */
  override def gt(`val`: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  /* CompleteClass */
  override def gte(`val`: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  /* CompleteClass */
  override def includeLower(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  /* CompleteClass */
  override def includeUpper(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  /* CompleteClass */
  override def lt(`val`: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  /* CompleteClass */
  override def lte(`val`: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  /* CompleteClass */
  override def normalize(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Will an optimization of using first a bounding box check will be
    used. Defaults to memory which will do in memory checks. Can also
    have values of indexed to use indexed value check, or none which
    disables bounding box optimization.
    */
  /* CompleteClass */
  override def optimizeBbox(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the point of origin in which distance will be measured from
    */
  /* CompleteClass */
  override def point(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the end point of the distance range
    */
  /* CompleteClass */
  override def to(numericDistance: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  /* CompleteClass */
  override def unit(unit: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceRangeFilter = js.native
}

