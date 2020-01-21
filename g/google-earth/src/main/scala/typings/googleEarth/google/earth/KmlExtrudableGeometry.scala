package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlExtrudableGeometry")
@js.native
class KmlExtrudableGeometry () extends KmlAltitudeGeometry {
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def getExtrude(): Boolean = js.native
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def getTessellate(): Boolean = js.native
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def setExtrude(extrude: Boolean): Unit = js.native
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def setTessellate(tessellate: Boolean): Unit = js.native
}

