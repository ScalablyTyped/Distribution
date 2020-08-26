package typings.fabric.fabricImplMod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilArc extends js.Object {
  /**
    * Draws arc
    */
  def drawArc(ctx: CanvasRenderingContext2D, fx: Double, fy: Double, coords: js.Array[Double]): Unit = js.native
  /**
    * Calculate bounding box of a elliptic-arc
    * @param fx start point of arc
    * @param rx horizontal radius
    * @param ry vertical radius
    * @param rot angle of horizontal axe
    * @param large 1 or 0, whatever the arc is the big or the small on the 2 points
    * @param sweep 1 or 0, 1 clockwise or counterclockwise direction
    * @param tx end point of arc
    */
  def getBoundsOfArc(
    fx: Double,
    fy: Double,
    rx: Double,
    ry: Double,
    rot: Double,
    large: Double,
    sweep: Double,
    tx: Double,
    ty: Double
  ): js.Array[Point] = js.native
  /**
    * Calculate bounding box of a beziercurve
    * @param x0 starting point
    * @param x1 first control point
    * @param x2 secondo control point
    * @param x3 end of beizer
    */
  def getBoundsOfCurve(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): js.Array[Point] = js.native
}

object IUtilArc {
  @scala.inline
  def apply(
    drawArc: (CanvasRenderingContext2D, Double, Double, js.Array[Double]) => Unit,
    getBoundsOfArc: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => js.Array[Point],
    getBoundsOfCurve: (Double, Double, Double, Double, Double, Double, Double, Double) => js.Array[Point]
  ): IUtilArc = {
    val __obj = js.Dynamic.literal(drawArc = js.Any.fromFunction4(drawArc), getBoundsOfArc = js.Any.fromFunction9(getBoundsOfArc), getBoundsOfCurve = js.Any.fromFunction8(getBoundsOfCurve))
    __obj.asInstanceOf[IUtilArc]
  }
  @scala.inline
  implicit class IUtilArcOps[Self <: IUtilArc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrawArc(value: (CanvasRenderingContext2D, Double, Double, js.Array[Double]) => Unit): Self = this.set("drawArc", js.Any.fromFunction4(value))
    @scala.inline
    def setGetBoundsOfArc(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => js.Array[Point]): Self = this.set("getBoundsOfArc", js.Any.fromFunction9(value))
    @scala.inline
    def setGetBoundsOfCurve(value: (Double, Double, Double, Double, Double, Double, Double, Double) => js.Array[Point]): Self = this.set("getBoundsOfCurve", js.Any.fromFunction8(value))
  }
  
}

