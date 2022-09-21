package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Intersection")
@js.native
open class Intersection () extends StObject {
  def this(status: String) = this()
  
  /**
    * Appends a point to intersection
    */
  def appendPoint(point: Point): Intersection = js.native
  
  /**
    * Appends points to intersection
    */
  def appendPoints(points: js.Array[Point]): Intersection = js.native
  
  var points: js.UndefOr[js.Array[Point]] = js.native
  
  var status: js.UndefOr[String] = js.native
}
/* static members */
object Intersection {
  
  @JSImport("fabric/fabric-impl", "Intersection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if one line intersects another
    */
  inline def intersectLineLine(a1: Point, a2: Point, b1: Point, b2: Point): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLineLine")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  
  /**
    * Checks if line intersects polygon
    */
  inline def intersectLinePolygon(a1: Point, a2: Point, points: js.Array[Point]): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectLinePolygon")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  
  /**
    * Checks if polygon intersects another polygon
    */
  inline def intersectPolygonPolygon(points1: js.Array[Point], points2: js.Array[Point]): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPolygonPolygon")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  
  /**
    * Checks if polygon intersects rectangle
    */
  inline def intersectPolygonRectangle(points: js.Array[Point], r1: Double, r2: Double): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPolygonRectangle")(points.asInstanceOf[js.Any], r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
}
