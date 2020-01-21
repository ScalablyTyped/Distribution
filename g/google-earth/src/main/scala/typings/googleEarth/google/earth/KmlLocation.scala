package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLocation")
@js.native
class KmlLocation () extends KmlObject {
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): Double = js.native
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double = js.native
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double = js.native
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Sets the latitude, longitude, and altitude of the Model.
    */
  def setLatLngAlt(lat: Double, lng: Double, alt: Double): Unit = js.native
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
}

