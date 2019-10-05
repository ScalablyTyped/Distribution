package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlPolyStyle")
@js.native
class KmlPolyStyle () extends KmlColorStyle {
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def getFill(): Boolean = js.native
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def getOutline(): Boolean = js.native
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def setFill(fill: Boolean): Unit = js.native
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def setOutline(outline: Boolean): Unit = js.native
}

