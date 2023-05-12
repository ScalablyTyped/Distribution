package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.LatLng")
@js.native
open class LatLng protected ()
  extends StObject
     with typings.googleMaps.google.maps.LatLng {
  /**
    * A <code>LatLng</code> is a point in geographical coordinates: latitude
    * and longitude.<br> <ul> <li>Latitude ranges between -90 and 90 degrees,
    * inclusive. Values above or below this range will be clamped to the range
    * [-90, 90]. This means that if the value specified is less than -90, it
    * will be set to -90. And if the value is greater than 90, it will be set
    * to 90.</li> <li>Longitude ranges between -180 and 180 degrees, inclusive.
    * Values above or below this range will be wrapped so that they fall within
    * the range. For example, a value of -190 will be converted to 170. A value
    * of 190 will be converted to -170. This reflects the fact that longitudes
    * wrap around the globe.</li> </ul> Although the default map projection
    * associates longitude with the x-coordinate of the map, and latitude with
    * the y-coordinate, the latitude coordinate is always written
    * <em>first</em>, followed by the longitude.<br> Notice that you cannot
    * modify the coordinates of a <code>LatLng</code>. If you want to compute
    * another point, you have to create a new one.<br> <p> Most methods that
    * accept <code>LatLng</code> objects also accept a {@link
    * google.maps.LatLngLiteral} object, so that the following are equivalent:
    * <pre> map.setCenter(new google.maps.LatLng(-34, 151));<br>
    * map.setCenter({lat: -34, lng: 151}); </pre> <p> The constructor also
    * accepts {@link google.maps.LatLngLiteral} and <code>LatLng</code>
    * objects. If a <code>LatLng</code> instance is passed to the constructor,
    * a copy is created. <p> The possible calls to the constructor are below:
    * <pre> new google.maps.LatLng(-34, 151);<br> new google.maps.LatLng(-34,
    * 151, true);<br> new google.maps.LatLng({lat: -34, lng: 151});<br> new
    * google.maps.LatLng({lat: -34, lng: 151}, true);<br> new
    * google.maps.LatLng({lat: -34, lng: 151}, null, true);<br> new
    * google.maps.LatLng(new google.maps.LatLng(-34, 151));<br> new
    * google.maps.LatLng(new google.maps.LatLng(-34, 151), true);<br> new
    * google.maps.LatLng(new google.maps.LatLng(-34, 151), null, true); </pre>
    *
    * Access by calling `const {LatLng} = await
    * google.maps.importLibrary("core")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  def this(latOrLatLngOrLatLngLiteral: Double) = this()
  def this(latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral) = this()
  def this(latOrLatLngOrLatLngLiteral: Double, lngOrNoClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: Double, lngOrNoClampNoWrap: Double) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral, lngOrNoClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral, lngOrNoClampNoWrap: Double) = this()
  def this(latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng, lngOrNoClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng, lngOrNoClampNoWrap: Double) = this()
  def this(latOrLatLngOrLatLngLiteral: Double, lngOrNoClampNoWrap: Boolean, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: Double, lngOrNoClampNoWrap: Double, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: Double, lngOrNoClampNoWrap: Null, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: Double, lngOrNoClampNoWrap: Unit, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral, lngOrNoClampNoWrap: Boolean, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral, lngOrNoClampNoWrap: Double, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral, lngOrNoClampNoWrap: Null, noClampNoWrap: Boolean) = this()
  def this(latOrLatLngOrLatLngLiteral: LatLngLiteral, lngOrNoClampNoWrap: Unit, noClampNoWrap: Boolean) = this()
  def this(
    latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng,
    lngOrNoClampNoWrap: Boolean,
    noClampNoWrap: Boolean
  ) = this()
  def this(
    latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng,
    lngOrNoClampNoWrap: Double,
    noClampNoWrap: Boolean
  ) = this()
  def this(
    latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng,
    lngOrNoClampNoWrap: Null,
    noClampNoWrap: Boolean
  ) = this()
  def this(
    latOrLatLngOrLatLngLiteral: typings.googleMaps.google.maps.LatLng,
    lngOrNoClampNoWrap: Unit,
    noClampNoWrap: Boolean
  ) = this()
}
