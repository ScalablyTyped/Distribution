package typings.elasticJs.mod

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "GeoDistanceFilter")
@js.native
class GeoDistanceFilter protected ()
  extends StObject
     with Filter {
  /*
    Filter results to those which fall within the given distance of the point of origin.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): GeoDistanceFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): GeoDistanceFilter = js.native
  
  /*
    Sets the numeric distance to be used.  The distance can be a
    numeric value, and then the unit (either mi or km can be set)
    controlling the unit. Or a single string with the unit as well.
    */
  def distance(numericDistance: Number): GeoDistanceFilter = js.native
  
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  def distanceType(`type`: String): GeoDistanceFilter = js.native
  
  /*
    Sets the fields to filter against.
    */
  def field(f: String): GeoDistanceFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): GeoDistanceFilter = js.native
  
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: String): GeoDistanceFilter = js.native
  
  /*
    Will an optimization of using first a bounding box check will be
    used. Defaults to memory which will do in memory checks. Can also
    have values of indexed to use indexed value check, or none which
    disables bounding box optimization.
    */
  def optimizeBbox(t: String): GeoDistanceFilter = js.native
  
  /*
    Sets the point of origin in which distance will be measured from
    */
  def point(p: GeoPoint): GeoDistanceFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): GeoDistanceFilter = js.native
  
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  def unit(unit: String): GeoDistanceFilter = js.native
}
