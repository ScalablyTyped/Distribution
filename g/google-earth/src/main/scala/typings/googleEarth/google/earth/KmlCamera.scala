package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlCamera")
@js.native
class KmlCamera () extends KmlAbstractView {
  /**
    * Distance from the earth's surface.
    */
  def getAltitude(): Double = js.native
  /**
    * Specifies how altitude components in the coordinates are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def getHeading(): Double = js.native
  /**
    * Latitude of the camera location. Degrees north or south of the Equator (0 degrees). Values range from -90 degrees to 90 degrees.
    */
  def getLatitude(): Double = js.native
  /**
    * Longitude of the camera location. Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double = js.native
  /**
    * Rotation, in degrees, of the camera around the Z axis. Values range from -180 to +180 degrees.
    */
  def getRoll(): Double = js.native
  /**
    * Angle between the direction of the camera position and the normal to the surface of the earth. Values range from 0 to 360 degrees.
    * A tilt value of 0 degrees indicates viewing from directly above, 90 degrees indicates viewing along the horizon, and 180 degrees indicates viewing straight up at the sky.
    */
  def getTilt(): Double = js.native
  /**
    * Sets the latitude, longitude, altitude, alitudeMode, heading, tilt, and roll values.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    heading: Double,
    tilt: Double,
    roll: Double
  ): Unit = js.native
  /**
    * Distance from the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Specifies how altitude components in the coordinates are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def setHeading(heading: Double): Unit = js.native
  /**
    * Latitude of the camera location. Degrees north or south of the Equator (0 degrees). Values range from -90 degrees to 90 degrees.
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * Longitude of the camera location. Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
  /**
    * Rotation, in degrees, of the camera around the Z axis. Values range from -180 to +180 degrees.
    */
  def setRoll(roll: Double): Unit = js.native
  /**
    * Angle between the direction of the camera position and the normal to the surface of the earth. Values range from 0 to 360 degrees.
    * A tilt value of 0 degrees indicates viewing from directly above, 90 degrees indicates viewing along the horizon, and 180 degrees indicates viewing straight up at the sky.
    */
  def setTilt(tilt: Double): Unit = js.native
}

