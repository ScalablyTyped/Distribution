package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Intersection")
@js.native
class Intersection () extends StObject {
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
object Intersection {
  
  /**
    * Checks if one line intersects another
    */
  @JSImport("fabric/fabric-impl", "Intersection.intersectLineLine")
  @js.native
  def intersectLineLine(a1: Point, a2: Point, b1: Point, b2: Point): Intersection = js.native
  
  /**
    * Checks if line intersects polygon
    */
  @JSImport("fabric/fabric-impl", "Intersection.intersectLinePolygon")
  @js.native
  def intersectLinePolygon(a1: Point, a2: Point, points: js.Array[Point]): Intersection = js.native
  
  /**
    * Checks if polygon intersects another polygon
    */
  @JSImport("fabric/fabric-impl", "Intersection.intersectPolygonPolygon")
  @js.native
  def intersectPolygonPolygon(points1: js.Array[Point], points2: js.Array[Point]): Intersection = js.native
  
  /**
    * Checks if polygon intersects rectangle
    */
  @JSImport("fabric/fabric-impl", "Intersection.intersectPolygonRectangle")
  @js.native
  def intersectPolygonRectangle(points: js.Array[Point], r1: Double, r2: Double): Intersection = js.native
}
