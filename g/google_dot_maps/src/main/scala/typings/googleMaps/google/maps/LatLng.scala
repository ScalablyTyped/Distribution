package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <code>LatLng</code> is a point in geographical coordinates: latitude and
  * longitude.<br> <ul> <li>Latitude ranges between -90 and 90 degrees,
  * inclusive. Values above or below this range will be clamped to the range
  * [-90, 90]. This means that if the value specified is less than -90, it will
  * be set to -90. And if the value is greater than 90, it will be set
  * to 90.</li> <li>Longitude ranges between -180 and 180 degrees, inclusive.
  * Values above or below this range will be wrapped so that they fall within
  * the range. For example, a value of -190 will be converted to 170. A value
  * of 190 will be converted to -170. This reflects the fact that longitudes
  * wrap around the globe.</li> </ul> Although the default map projection
  * associates longitude with the x-coordinate of the map, and latitude with
  * the y-coordinate, the latitude coordinate is always written <em>first</em>,
  * followed by the longitude.<br> Notice that you cannot modify the
  * coordinates of a <code>LatLng</code>. If you want to compute another point,
  * you have to create a new one.<br> <p> Most methods that accept
  * <code>LatLng</code> objects also accept a {@link google.maps.LatLngLiteral}
  * object, so that the following are equivalent: <pre> map.setCenter(new
  * google.maps.LatLng(-34, 151));<br> map.setCenter({lat: -34, lng: 151});
  * </pre> <p> The constructor also accepts {@link google.maps.LatLngLiteral}
  * and <code>LatLng</code> objects. If a <code>LatLng</code> instance is
  * passed to the constructor, a copy is created. <p> The possible calls to the
  * constructor are below: <pre> new google.maps.LatLng(-34, 151);<br> new
  * google.maps.LatLng(-34, 151, true);<br> new google.maps.LatLng({lat: -34,
  * lng: 151});<br> new google.maps.LatLng({lat: -34, lng: 151}, true);<br> new
  * google.maps.LatLng({lat: -34, lng: 151}, null, true);<br> new
  * google.maps.LatLng(new google.maps.LatLng(-34, 151));<br> new
  * google.maps.LatLng(new google.maps.LatLng(-34, 151), true);<br> new
  * google.maps.LatLng(new google.maps.LatLng(-34, 151), null, true); </pre>
  */
@js.native
trait LatLng extends StObject {
  
  /**
    * Comparison function.
    */
  def equals(): Boolean = js.native
  def equals(other: LatLng): Boolean = js.native
  
  /**
    * Returns the latitude in degrees.
    */
  def lat(): Double = js.native
  
  /**
    * Returns the longitude in degrees.
    */
  def lng(): Double = js.native
  
  /**
    * Converts to JSON representation. This function is intended to be used via
    * <code>JSON.stringify</code>.
    */
  def toJSON(): LatLngLiteral = js.native
  
  /**
    * Returns a string of the form &quot;lat,lng&quot; for this LatLng. We
    * round the lat/lng values to 6 decimal places by default.
    */
  def toUrlValue(): String = js.native
  def toUrlValue(precision: Double): String = js.native
}
