package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilArc extends js.Object {
  /**
  	 * Draws arc
  	 */
  def drawArc(
    ctx: stdLib.CanvasRenderingContext2D,
    fx: scala.Double,
    fy: scala.Double,
    coords: js.Array[scala.Double]
  ): scala.Unit
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
    fx: scala.Double,
    fy: scala.Double,
    rx: scala.Double,
    ry: scala.Double,
    rot: scala.Double,
    large: scala.Double,
    sweep: scala.Double,
    tx: scala.Double,
    ty: scala.Double
  ): js.Array[Point]
  /**
  	 * Calculate bounding box of a beziercurve
  	 * @param x0 starting point
  	 * @param x1 first control point
  	 * @param x2 secondo control point
  	 * @param x3 end of beizer
  	 */
  def getBoundsOfCurve(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): js.Array[Point]
}

object IUtilArc {
  @scala.inline
  def apply(
    drawArc: (stdLib.CanvasRenderingContext2D, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Unit,
    getBoundsOfArc: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[Point],
    getBoundsOfCurve: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[Point]
  ): IUtilArc = {
    val __obj = js.Dynamic.literal(drawArc = js.Any.fromFunction4(drawArc), getBoundsOfArc = js.Any.fromFunction9(getBoundsOfArc), getBoundsOfCurve = js.Any.fromFunction8(getBoundsOfCurve))
  
    __obj.asInstanceOf[IUtilArc]
  }
}

