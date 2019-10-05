package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlPoint")
@js.native
class KmlPoint () extends KmlExtrudableGeometry {
  /**
    * The point's altitude, in meters.
    */
  def getAltitude(): Double = js.native
  /**
    * The point's latitude, in degrees.
    */
  def getLatitude(): Double = js.native
  /**
    * The point's longitude, in degrees.
    */
  def getLongitude(): Double = js.native
  /**
    * Sets altitudeMode, extrude, tessellate, latitude, longitude, and altitude values.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    extrude: Boolean,
    tessellate: Boolean
  ): Unit = js.native
  /**
    * The point's altitude, in meters.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Sets the latitude and longitude.
    */
  def setLatLng(latitude: Double, longitude: Double): Unit = js.native
  /**
    * Sets the latitude, longitude, and altitide.
    */
  def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  /**
    * The point's latitude, in degrees.
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * The point's longitude, in degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
}

