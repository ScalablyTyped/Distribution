package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLatLonAltBox")
@js.native
class KmlLatLonAltBox () extends KmlLatLonBox {
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Maximim altitude, specified in meters above sea level.
    */
  def getMaxAltitude(): Double = js.native
  /**
    * Minimum altitude, specified in meters above sea level.
    */
  def getMinAltitude(): Double = js.native
  /**
    * Sets the north, south, east, west, rotation, minAltitude, maxAltitude, and altitudeMode of bounding box.
    */
  def setAltBox(
    north: Double,
    south: Double,
    east: Double,
    west: Double,
    rotation: Double,
    minAltitude: Double,
    maxAltitude: Double,
    altitudeMode: KmlAltitudeModeEnum
  ): Unit = js.native
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Double = js.native
  /**
    * Maximim altitude, specified in meters above sea level.
    */
  def setMaxAltitude(maxAltitude: Double): Unit = js.native
  /**
    * Minimum altitude, specified in meters above sea level.
    */
  def setMinAltitude(minAltitude: Double): Unit = js.native
}

