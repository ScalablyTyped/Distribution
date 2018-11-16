package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLookAt")
@js.native
class KmlLookAt () extends KmlAbstractView {
  /**
       * Distance from the earth's surface, in meters.
       */
  def getAltitude(): scala.Double = js.native
  /**
       * Specifies how altitude components in the coordinates element are interpreted.
       */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
       * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
       */
  def getHeading(): scala.Double = js.native
  /**
       * Latitude of the point the camera is looking at.
       * Degrees north or south of the Equator (0 degrees).
       * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
       */
  def getLatitude(): scala.Double = js.native
  /**
       * Latitude of the point the camera is looking at.
       * Degrees north or south of the Equator (0 degrees).
       * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
       */
  def getLongitude(): scala.Double = js.native
  /**
       * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
       */
  def getRange(): scala.Double = js.native
  /**
       * Angle between the direction of the LookAt position and the normal to the surface of the earth.
       * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
       * A tilt value of 0 degrees indicates viewing from directly above.
       * A tilt value of 90 degrees indicates viewing along the horizon.
       */
  def getTilt(): scala.Double = js.native
  /**
       * Sets the latitude, longitude, altitude, altitudeMode, heading, tilt, and range for the camera.
       */
  def set(
    latitude: scala.Double,
    longitude: scala.Double,
    altitude: scala.Double,
    altitudeMode: KmlAltitudeModeEnum,
    heading: scala.Double,
    tilt: scala.Double,
    range: scala.Double
  ): scala.Unit = js.native
  /**
       * Distance from the earth's surface, in meters.
       */
  def setAltitude(altitude: scala.Double): scala.Unit = js.native
  /**
       * Specifies how altitude components in the coordinates element are interpreted.
       */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): scala.Unit = js.native
  /**
       * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
       */
  def setHeading(heading: scala.Double): scala.Unit = js.native
  /**
       * Latitude of the point the camera is looking at.
       * Degrees north or south of the Equator (0 degrees).
       * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
       */
  def setLatitude(latitude: scala.Double): scala.Unit = js.native
  /**
       * Latitude of the point the camera is looking at.
       * Degrees north or south of the Equator (0 degrees).
       * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
       */
  def setLongitude(longitude: scala.Double): scala.Unit = js.native
  /**
       * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
       */
  def setRange(range: scala.Double): scala.Unit = js.native
  /**
       * Angle between the direction of the LookAt position and the normal to the surface of the earth.
       * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
       * A tilt value of 0 degrees indicates viewing from directly above.
       * A tilt value of 90 degrees indicates viewing along the horizon.
       */
  def setTilt(tilt: scala.Double): scala.Unit = js.native
}

