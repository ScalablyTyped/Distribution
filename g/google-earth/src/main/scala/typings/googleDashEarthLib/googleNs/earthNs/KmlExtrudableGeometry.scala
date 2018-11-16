package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlExtrudableGeometry")
@js.native
class KmlExtrudableGeometry () extends KmlAltitudeGeometry {
  /**
       * Specifies whether to connect the geometry to the ground.
       */
  def getExtrude(): scala.Boolean = js.native
  /**
       * Specifies whether to allow the geometry to follow the terrain elevation.
       */
  def getTessellate(): scala.Boolean = js.native
  /**
       * Specifies whether to connect the geometry to the ground.
       */
  def setExtrude(extrude: scala.Boolean): scala.Unit = js.native
  /**
       * Specifies whether to allow the geometry to follow the terrain elevation.
       */
  def setTessellate(tessellate: scala.Boolean): scala.Unit = js.native
}

