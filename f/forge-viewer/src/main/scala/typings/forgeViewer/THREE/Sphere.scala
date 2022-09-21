package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sphere extends StObject {
  
  def applyMatrix4(matrix: Matrix4): Sphere = js.native
  
  var center: Vector3 = js.native
  
  def clampPoint(point: Vector3): Vector3 = js.native
  def clampPoint(point: Vector3, optionalTarget: Vector3): Vector3 = js.native
  
  def containsPoint(point: Vector3): Boolean = js.native
  
  def copy(sphere: Sphere): Sphere = js.native
  
  def distanceToPoint(point: Vector3): Double = js.native
  
  def empty(): Boolean = js.native
  
  def equals(sphere: Sphere): Boolean = js.native
  
  def getBoundingBox(): Box3 = js.native
  def getBoundingBox(optionalTarget: Box3): Box3 = js.native
  
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  
  var radius: Double = js.native
  
  def set(center: Vector3, radius: Double): Sphere = js.native
  
  def setFromPoints(points: js.Array[Vector3]): Sphere = js.native
  def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3): Sphere = js.native
  
  def translate(offset: Vector3): Sphere = js.native
}
