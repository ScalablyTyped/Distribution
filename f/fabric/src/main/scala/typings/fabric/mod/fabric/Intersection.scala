package typings.fabric.mod.fabric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Intersection")
@js.native
class Intersection ()
  extends typings.fabric.fabricImplMod.Intersection {
  def this(status: String) = this()
}
/* static members */
object Intersection {
  
  @JSImport("fabric", "fabric.Intersection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if one line intersects another
    */
  @scala.inline
  def intersectLineLine(
    a1: typings.fabric.fabricImplMod.Point,
    a2: typings.fabric.fabricImplMod.Point,
    b1: typings.fabric.fabricImplMod.Point,
    b2: typings.fabric.fabricImplMod.Point
  ): typings.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLineLine")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Intersection]
  
  /**
    * Checks if line intersects polygon
    */
  @scala.inline
  def intersectLinePolygon(
    a1: typings.fabric.fabricImplMod.Point,
    a2: typings.fabric.fabricImplMod.Point,
    points: js.Array[typings.fabric.fabricImplMod.Point]
  ): typings.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLinePolygon")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Intersection]
  
  /**
    * Checks if polygon intersects another polygon
    */
  @scala.inline
  def intersectPolygonPolygon(
    points1: js.Array[typings.fabric.fabricImplMod.Point],
    points2: js.Array[typings.fabric.fabricImplMod.Point]
  ): typings.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPolygonPolygon")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Intersection]
  
  /**
    * Checks if polygon intersects rectangle
    */
  @scala.inline
  def intersectPolygonRectangle(points: js.Array[typings.fabric.fabricImplMod.Point], r1: Double, r2: Double): typings.fabric.fabricImplMod.Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPolygonRectangle")(points.asInstanceOf[js.Any], r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Intersection]
}
