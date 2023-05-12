package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.LatLngAltitudeLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.LatLngAltitude")
@js.native
open class LatLngAltitude protected ()
  extends StObject
     with typings.googleMaps.google.maps.LatLngAltitude {
  def this(value: typings.googleMaps.google.maps.LatLng) = this()
  /**
    * A <code>LatLngAltitude</code> is a 3D point in geographical coordinates:
    * latitude, longitude, and altitude.<br> <ul> <li>Latitude ranges between
    * -90 and 90 degrees, inclusive. Values above or below this range will be
    * clamped to the range [-90, 90]. This means that if the value specified is
    * less than -90, it will be set to -90. And if the value is greater than
    * 90, it will be set to 90.</li> <li>Longitude ranges between -180 and 180
    * degrees, inclusive. Values above or below this range will be wrapped so
    * that they fall within the range. For example, a value of -190 will be
    * converted to 170. A value of 190 will be converted to -170. This reflects
    * the fact that longitudes wrap around the globe.</li> <li>Altitude is
    * measured in meters. Positive values denote heights above ground level,
    * and negative values denote heights underneath the ground surface.</li>
    * </ul>
    *
    * Access by calling `const {LatLngAltitude} = await
    * google.maps.importLibrary("core")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    * @param value The initializing value.
    * @param noClampNoWrap Whether to preserve the initialization values, even
    *     if they may not necessarily be valid latitude values in the range of
    *     [-90, 90] or valid longitude values in the range of [-180, 180]. The
    *     default is <code>false</code> which enables latitude clamping and
    *     longitude wrapping.
    */
  def this(value: LatLngAltitudeLiteral) = this()
  def this(value: LatLngLiteral) = this()
  def this(value: LatLngAltitudeLiteral, noClampNoWrap: Boolean) = this()
  def this(value: LatLngLiteral, noClampNoWrap: Boolean) = this()
  def this(value: typings.googleMaps.google.maps.LatLng, noClampNoWrap: Boolean) = this()
  
  /**
    * Distance (in meters) above the ground surface. Negative value means
    * underneath the ground surface.
    * @defaultValue <code>0</code>
    */
  /* CompleteClass */
  var altitude: Double = js.native
  
  /**
    * Latitude in degrees. Values will be clamped to the range [-90, 90]. This
    * means that if the value specified is less than -90, it will be set to
    * -90. And if the value is greater than 90, it will be set to 90.
    */
  /* CompleteClass */
  var lat: Double = js.native
  
  /**
    * Longitude in degrees. Values outside the range [-180, 180] will be
    * wrapped so that they fall within the range. For example, a value of -190
    * will be converted to 170. A value of 190 will be converted to -170. This
    * reflects the fact that longitudes wrap around the globe.
    */
  /* CompleteClass */
  var lng: Double = js.native
}
