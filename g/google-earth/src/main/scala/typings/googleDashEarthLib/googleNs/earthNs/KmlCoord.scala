package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlCoord")
@js.native
class KmlCoord () extends js.Object {
  /**
       * Distance from the earth's surface.
       */
  def getAltitude(): scala.Double = js.native
  /**
       * Degrees north or south of the Equator (0 degrees).
       * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
       */
  def getLatitude(): scala.Double = js.native
  /**
       * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
       * Values east of the Meridian range from 0 to 180 degrees.
       */
  def getLongitude(): scala.Double = js.native
  /**
       * Distance from the earth's surface.
       */
  def setAltitude(altitude: scala.Double): scala.Unit = js.native
  /**
       * Sets the latitude, longitude, altitude.
       */
  def setLatLngAlt(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): scala.Unit = js.native
  /**
       * Degrees north or south of the Equator (0 degrees).
       * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
       */
  def setLatitude(latitude: scala.Double): scala.Unit = js.native
  /**
       * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
       * Values east of the Meridian range from 0 to 180 degrees.
       */
  def setLongitude(longitude: scala.Double): scala.Unit = js.native
}

