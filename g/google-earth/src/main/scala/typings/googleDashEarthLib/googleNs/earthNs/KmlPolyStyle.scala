package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlPolyStyle")
@js.native
class KmlPolyStyle () extends KmlColorStyle {
  /**
       * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
       */
  def getFill(): scala.Boolean = js.native
  /**
       * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
       */
  def getOutline(): scala.Boolean = js.native
  /**
       * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
       */
  def setFill(fill: scala.Boolean): scala.Unit = js.native
  /**
       * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
       */
  def setOutline(outline: scala.Boolean): scala.Unit = js.native
}

