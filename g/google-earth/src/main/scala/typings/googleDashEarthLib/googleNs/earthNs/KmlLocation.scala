package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLocation")
@js.native
class KmlLocation () extends KmlObject {
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): scala.Double = js.native
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): scala.Double = js.native
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): scala.Double = js.native
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: scala.Double): scala.Unit = js.native
  /**
    * Sets the latitude, longitude, and altitude of the Model.
    */
  def setLatLngAlt(lat: scala.Double, lng: scala.Double, alt: scala.Double): scala.Unit = js.native
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: scala.Double): scala.Unit = js.native
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: scala.Double): scala.Unit = js.native
}

