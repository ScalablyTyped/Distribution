package typings.fabric.fabricMod.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Intersection")
@js.native
class Intersection ()
  extends typings.fabric.fabricDashImplMod.Intersection {
  def this(status: String) = this()
}

/* static members */
@JSImport("fabric", "fabric.Intersection")
@js.native
object Intersection extends js.Object {
  /**
  	 * Checks if one line intersects another
  	 */
  def intersectLineLine(
    a1: typings.fabric.fabricDashImplMod.Point,
    a2: typings.fabric.fabricDashImplMod.Point,
    b1: typings.fabric.fabricDashImplMod.Point,
    b2: typings.fabric.fabricDashImplMod.Point
  ): typings.fabric.fabricDashImplMod.Intersection = js.native
  /**
  	 * Checks if line intersects polygon
  	 */
  def intersectLinePolygon(
    a1: typings.fabric.fabricDashImplMod.Point,
    a2: typings.fabric.fabricDashImplMod.Point,
    points: js.Array[typings.fabric.fabricDashImplMod.Point]
  ): typings.fabric.fabricDashImplMod.Intersection = js.native
  /**
  	 * Checks if polygon intersects another polygon
  	 */
  def intersectPolygonPolygon(
    points1: js.Array[typings.fabric.fabricDashImplMod.Point],
    points2: js.Array[typings.fabric.fabricDashImplMod.Point]
  ): typings.fabric.fabricDashImplMod.Intersection = js.native
  /**
  	 * Checks if polygon intersects rectangle
  	 */
  def intersectPolygonRectangle(points: js.Array[typings.fabric.fabricDashImplMod.Point], r1: Double, r2: Double): typings.fabric.fabricDashImplMod.Intersection = js.native
}

