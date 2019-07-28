package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlGroundOverlay")
@js.native
class KmlGroundOverlay () extends KmlOverlay {
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): Double = js.native
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * The bounding box of the ground overlay.
    */
  def getLatLonBox(): KmlLatLonBox = js.native
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * The bounding box of the ground overlay.
    */
  def setLatLonBox(latLonBox: KmlLatLonBox): Unit = js.native
}

