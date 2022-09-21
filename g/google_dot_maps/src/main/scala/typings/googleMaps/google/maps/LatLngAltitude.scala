package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <code>LatLngAltitude</code> is a 3D point in geographical coordinates:
  * latitude, longitude, and altitude.<br> <ul> <li>Latitude ranges between -90
  * and 90 degrees, inclusive. Values above or below this range will be clamped
  * to the range [-90, 90]. This means that if the value specified is less than
  * -90, it will be set to -90. And if the value is greater than 90, it will be
  * set to 90.</li> <li>Longitude ranges between -180 and 180 degrees,
  * inclusive. Values above or below this range will be wrapped so that they
  * fall within the range. For example, a value of -190 will be converted to
  * 170. A value of 190 will be converted to -170. This reflects the fact that
  * longitudes wrap around the globe.</li> <li>Altitude is measured in meters.
  * Positive values denote heights above ground level, and negative values
  * denote heights underneath the ground surface.</li> </ul>
  */
@js.native
trait LatLngAltitude
  extends StObject
     with LatLngAltitudeLiteral {
  
  /**
    * Comparison function.
    * @param other Another LatLngAltitude object.
    */
  def equals(): Boolean = js.native
  def equals(other: LatLngAltitude): Boolean = js.native
  
  def toJSON(): LatLngAltitudeLiteral = js.native
}
