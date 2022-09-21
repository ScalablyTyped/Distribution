package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector3
  extends StObject
     with Vector {
  
  def add(a: Vector3): Vector3 = js.native
  
  def addScalar(s: Double): Vector3 = js.native
  
  def addVectors(a: Vector3, b: Vector3): Vector3 = js.native
  
  def angleTo(v: Vector3): Double = js.native
  
  def applyAxisAngle(axis: Vector3, angle: Double): Vector3 = js.native
  
  def applyEuler(euler: Euler): Vector3 = js.native
  
  def applyMatrix3(m: Matrix3): Vector3 = js.native
  
  def applyMatrix4(m: Matrix4): Vector3 = js.native
  
  def applyProjection(m: Matrix4): Vector3 = js.native
  
  def applyQuaternion(q: Quaternion): Vector3 = js.native
  
  def ceil(): Vector3 = js.native
  
  def clamp(min: Vector3, max: Vector3): Vector3 = js.native
  
  def clampScalar(min: Double, max: Double): Vector3 = js.native
  
  def copy(v: Vector3): Vector3 = js.native
  
  def cross(a: Vector3): Vector3 = js.native
  
  def crossVectors(a: Vector3, b: Vector3): Vector3 = js.native
  
  @JSName("distanceToSquared")
  def distanceToSquared_MVector3(v: Vector3): Double = js.native
  
  @JSName("distanceTo")
  def distanceTo_MVector3(v: Vector3): Double = js.native
  
  def divide(v: Vector3): Vector3 = js.native
  
  def dot(v: Vector3): Double = js.native
  
  def equals(v: Vector3): Boolean = js.native
  
  def floor(): Vector3 = js.native
  
  def fromArray(xyz: js.Array[Double]): Vector3 = js.native
  def fromArray(xyz: js.Array[Double], offset: Double): Vector3 = js.native
  
  def fromAttribute(attribute: BufferAttribute, index: Double): Vector3 = js.native
  def fromAttribute(attribute: BufferAttribute, index: Double, offset: Double): Vector3 = js.native
  
  def lengthManhattan(): Double = js.native
  
  def lerp(v: Vector3, alpha: Double): Vector3 = js.native
  
  def lerpVectors(v1: Vector3, v2: Vector3, alpha: Double): Vector3 = js.native
  
  def max(v: Vector3): Vector3 = js.native
  
  def min(v: Vector3): Vector3 = js.native
  
  def multiply(v: Vector3): Vector3 = js.native
  
  def multiplyVectors(a: Vector3, b: Vector3): Vector3 = js.native
  
  def project(camera: Camera): Vector3 = js.native
  
  def projectOnPlane(planeNormal: Vector3): Vector3 = js.native
  
  def projectOnVector(v: Vector3): Vector3 = js.native
  
  def reflect(vector: Vector3): Vector3 = js.native
  
  def round(): Vector3 = js.native
  
  def roundToZero(): Vector3 = js.native
  
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  
  def setFromMatrixColumn(index: Double, matrix: Matrix4): Vector3 = js.native
  
  def setFromMatrixPosition(m: Matrix4): Vector3 = js.native
  
  def setFromMatrixScale(m: Matrix4): Vector3 = js.native
  
  def setX(x: Double): Vector3 = js.native
  
  def setY(y: Double): Vector3 = js.native
  
  def setZ(z: Double): Vector3 = js.native
  
  def sub(a: Vector3): Vector3 = js.native
  
  def subScalar(s: Double): Vector3 = js.native
  
  def subVectors(a: Vector3, b: Vector3): Vector3 = js.native
  
  def toArray(): js.Array[Double] = js.native
  def toArray(xyz: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xyz: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def toArray(xyz: Unit, offset: Double): js.Array[Double] = js.native
  
  def transformDirection(m: Matrix4): Vector3 = js.native
  
  def unproject(camera: Camera): Vector3 = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
