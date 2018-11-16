package typings
package googleDashEarthLib.googleNs.earthNs

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
  def getMaxAltitude(): scala.Double = js.native
  /**
       * Minimum altitude, specified in meters above sea level.
       */
  def getMinAltitude(): scala.Double = js.native
  /**
       * Sets the north, south, east, west, rotation, minAltitude, maxAltitude, and altitudeMode of bounding box.
       */
  def setAltBox(
    north: scala.Double,
    south: scala.Double,
    east: scala.Double,
    west: scala.Double,
    rotation: scala.Double,
    minAltitude: scala.Double,
    maxAltitude: scala.Double,
    altitudeMode: KmlAltitudeModeEnum
  ): scala.Unit = js.native
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
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): scala.Double = js.native
  /**
       * Maximim altitude, specified in meters above sea level.
       */
  def setMaxAltitude(maxAltitude: scala.Double): scala.Unit = js.native
  /**
       * Minimum altitude, specified in meters above sea level.
       */
  def setMinAltitude(minAltitude: scala.Double): scala.Unit = js.native
}

