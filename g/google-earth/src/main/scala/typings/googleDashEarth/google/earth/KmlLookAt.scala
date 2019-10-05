package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLookAt")
@js.native
class KmlLookAt () extends KmlAbstractView {
  /**
    * Distance from the earth's surface, in meters.
    */
  def getAltitude(): Double = js.native
  /**
    * Specifies how altitude components in the coordinates element are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def getHeading(): Double = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLongitude(): Double = js.native
  /**
    * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
    */
  def getRange(): Double = js.native
  /**
    * Angle between the direction of the LookAt position and the normal to the surface of the earth.
    * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
    * A tilt value of 0 degrees indicates viewing from directly above.
    * A tilt value of 90 degrees indicates viewing along the horizon.
    */
  def getTilt(): Double = js.native
  /**
    * Sets the latitude, longitude, altitude, altitudeMode, heading, tilt, and range for the camera.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    heading: Double,
    tilt: Double,
    range: Double
  ): Unit = js.native
  /**
    * Distance from the earth's surface, in meters.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Specifies how altitude components in the coordinates element are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def setHeading(heading: Double): Unit = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLongitude(longitude: Double): Unit = js.native
  /**
    * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
    */
  def setRange(range: Double): Unit = js.native
  /**
    * Angle between the direction of the LookAt position and the normal to the surface of the earth.
    * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
    * A tilt value of 0 degrees indicates viewing from directly above.
    * A tilt value of 90 degrees indicates viewing along the horizon.
    */
  def setTilt(tilt: Double): Unit = js.native
}

