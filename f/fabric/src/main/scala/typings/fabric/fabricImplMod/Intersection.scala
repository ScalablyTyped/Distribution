package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Intersection")
@js.native
class Intersection () extends js.Object {
  def this(status: String) = this()
  /**
  	 * Appends a point to intersection
  	 */
  def appendPoint(point: Point): Intersection = js.native
  /**
  	 * Appends points to intersection
  	 */
  def appendPoints(points: js.Array[Point]): Intersection = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Intersection")
@js.native
object Intersection extends js.Object {
  /**
  	 * Checks if one line intersects another
  	 */
  def intersectLineLine(a1: Point, a2: Point, b1: Point, b2: Point): Intersection = js.native
  /**
  	 * Checks if line intersects polygon
  	 */
  def intersectLinePolygon(a1: Point, a2: Point, points: js.Array[Point]): Intersection = js.native
  /**
  	 * Checks if polygon intersects another polygon
  	 */
  def intersectPolygonPolygon(points1: js.Array[Point], points2: js.Array[Point]): Intersection = js.native
  /**
  	 * Checks if polygon intersects rectangle
  	 */
  def intersectPolygonRectangle(points: js.Array[Point], r1: Double, r2: Double): Intersection = js.native
}

