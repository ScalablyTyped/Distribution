package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlAltitudeGeometry")
@js.native
class KmlAltitudeGeometry () extends KmlGeometry {
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
}

