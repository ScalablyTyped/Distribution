package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Filter")
@js.native
class Filter () extends js.Object {
  // methods
  def applyFilter(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Boolean = js.native
  def applyFilter(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    targetCtx: stdLib.CanvasRenderingContext2D
  ): scala.Boolean = js.native
  def applyFilter(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    targetCtx: stdLib.CanvasRenderingContext2D,
    targetX: scala.Double
  ): scala.Boolean = js.native
  def applyFilter(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    targetCtx: stdLib.CanvasRenderingContext2D,
    targetX: scala.Double,
    targetY: scala.Double
  ): scala.Boolean = js.native
  def getBounds(): Rectangle = js.native
}

