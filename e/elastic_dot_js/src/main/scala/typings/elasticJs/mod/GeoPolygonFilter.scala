package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "GeoPolygonFilter")
@js.native
class GeoPolygonFilter protected () extends StObject {
  /*
    Filter results to those which are contained within the polygon of points.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): GeoPolygonFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): GeoPolygonFilter = js.native
  
  /*
    Sets the fields to filter against.
    */
  def field(f: String): GeoPolygonFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): GeoPolygonFilter = js.native
  
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: String): GeoPolygonFilter = js.native
  
  /*
    Sets a series of points that represent a polygon.  If passed a
    single GeoPoint object, it is added to the current
    list of points.  If passed an array of GeoPoint
    objects it replaces all current values.
    */
  def points(pointsArray: js.Array[js.Any]): GeoPolygonFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): GeoPolygonFilter = js.native
}
