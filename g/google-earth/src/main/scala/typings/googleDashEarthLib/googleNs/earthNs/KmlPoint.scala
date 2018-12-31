package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlPoint")
@js.native
class KmlPoint () extends KmlExtrudableGeometry {
  /**
    * The point's altitude, in meters.
    */
  def getAltitude(): scala.Double = js.native
  /**
    * The point's latitude, in degrees.
    */
  def getLatitude(): scala.Double = js.native
  /**
    * The point's longitude, in degrees.
    */
  def getLongitude(): scala.Double = js.native
  /**
    * Sets altitudeMode, extrude, tessellate, latitude, longitude, and altitude values.
    */
  def set(
    latitude: scala.Double,
    longitude: scala.Double,
    altitude: scala.Double,
    altitudeMode: KmlAltitudeModeEnum,
    extrude: scala.Boolean,
    tessellate: scala.Boolean
  ): scala.Unit = js.native
  /**
    * The point's altitude, in meters.
    */
  def setAltitude(altitude: scala.Double): scala.Unit = js.native
  /**
    * Sets the latitude and longitude.
    */
  def setLatLng(latitude: scala.Double, longitude: scala.Double): scala.Unit = js.native
  /**
    * Sets the latitude, longitude, and altitide.
    */
  def setLatLngAlt(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): scala.Unit = js.native
  /**
    * The point's latitude, in degrees.
    */
  def setLatitude(latitude: scala.Double): scala.Unit = js.native
  /**
    * The point's longitude, in degrees.
    */
  def setLongitude(longitude: scala.Double): scala.Unit = js.native
}

