package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plane extends StObject {
  
  def applyMatrix4(matrix: Matrix4): Plane = js.native
  def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3): Plane = js.native
  
  var constant: Double = js.native
  
  def coplanarPoint(): Vector3 = js.native
  def coplanarPoint(optionalTarget: Boolean): Vector3 = js.native
  
  def copy(plane: Plane): Plane = js.native
  
  def distanceToPoint(point: Vector3): Double = js.native
  
  def distanceToSphere(sphere: Sphere): Double = js.native
  
  def equals(plane: Plane): Boolean = js.native
  
  def intersectLine(line: Line3): Vector3 = js.native
  def intersectLine(line: Line3, optionalTarget: Vector3): Vector3 = js.native
  
  def isIntersectionLine(line: Line3): Boolean = js.native
  
  def negate(): Plane = js.native
  
  var normal: Vector3 = js.native
  
  def normalize(): Plane = js.native
  
  def orthoPoint(point: Vector3): Vector3 = js.native
  def orthoPoint(point: Vector3, optionalTarget: Vector3): Vector3 = js.native
  
  def projectPoint(point: Vector3): Vector3 = js.native
  def projectPoint(point: Vector3, optionalTarget: Vector3): Vector3 = js.native
  
  def set(normal: Vector3, constant: Double): Plane = js.native
  
  def setComponents(x: Double, y: Double, z: Double, w: Double): Plane = js.native
  
  def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = js.native
  
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = js.native
  
  def translate(offset: Vector3): Plane = js.native
}
