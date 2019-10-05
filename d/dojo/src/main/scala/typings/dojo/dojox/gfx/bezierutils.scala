package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/bezierutils.html
  *
  *
  */
trait bezierutils extends js.Object {
  /**
    * Returns the length of the given bezier curve.
    *
    * @param points The bezier points. Should be [p1x, p1y, c1x, c1y, c2x, c2y, p2x, p2y] for a cubicbezier curve or [p1x, p1y, cx, cy, p2x, p2y] for a quadratic bezier curve.
    */
  def computeLength(points: js.Array[Double]): Double
  /**
    * Returns the distance between the specified points.
    *
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    */
  def distance(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): js.Any
  /**
    *
    * @param points
    * @param t
    */
  def splitBezierAtT(points: js.Any, t: js.Any): js.Any
  /**
    * Returns the t corresponding to the given length for the specified bezier curve.
    *
    * @param points The bezier points. Should be [p1x, p1y, c1x, c1y, c2x, c2y, p2x, p2y] for a cubicbezier curve or [p1x, p1y, cx, cy, p2x, p2y] for a quadratic bezier curve.
    * @param length The length.
    */
  def tAtLength(points: js.Array[Double], length: Double): Double
}

object bezierutils {
  @scala.inline
  def apply(
    computeLength: js.Array[Double] => Double,
    distance: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    splitBezierAtT: (js.Any, js.Any) => js.Any,
    tAtLength: (js.Array[Double], Double) => Double
  ): bezierutils = {
    val __obj = js.Dynamic.literal(computeLength = js.Any.fromFunction1(computeLength), distance = js.Any.fromFunction4(distance), splitBezierAtT = js.Any.fromFunction2(splitBezierAtT), tAtLength = js.Any.fromFunction2(tAtLength))
  
    __obj.asInstanceOf[bezierutils]
  }
}

