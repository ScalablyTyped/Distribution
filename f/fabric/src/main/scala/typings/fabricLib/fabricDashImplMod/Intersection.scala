package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Intersection")
@js.native
class Intersection () extends js.Object {
  def this(status: java.lang.String) = this()
  /**
  	 * Appends a point to intersection
  	 */
  def appendPoint(point: Point): scala.Unit = js.native
  /**
  	 * Appends points to intersection
  	 */
  def appendPoints(points: js.Array[Point]): scala.Unit = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Intersection")
@js.native
object Intersection extends js.Object {
  /**
  	 * Checks if one line intersects another
  	 */
  def intersectLineLine(
    a1: fabricLib.fabricDashImplMod.Point,
    a2: fabricLib.fabricDashImplMod.Point,
    b1: fabricLib.fabricDashImplMod.Point,
    b2: fabricLib.fabricDashImplMod.Point
  ): fabricLib.fabricDashImplMod.Intersection = js.native
  /**
  	 * Checks if line intersects polygon
  	 */
  def intersectLinePolygon(
    a1: fabricLib.fabricDashImplMod.Point,
    a2: fabricLib.fabricDashImplMod.Point,
    points: js.Array[fabricLib.fabricDashImplMod.Point]
  ): fabricLib.fabricDashImplMod.Intersection = js.native
  /**
  	 * Checks if polygon intersects another polygon
  	 */
  def intersectPolygonPolygon(
    points1: js.Array[fabricLib.fabricDashImplMod.Point],
    points2: js.Array[fabricLib.fabricDashImplMod.Point]
  ): fabricLib.fabricDashImplMod.Intersection = js.native
  /**
  	 * Checks if polygon intersects rectangle
  	 */
  def intersectPolygonRectangle(points: js.Array[fabricLib.fabricDashImplMod.Point], r1: scala.Double, r2: scala.Double): fabricLib.fabricDashImplMod.Intersection = js.native
}

