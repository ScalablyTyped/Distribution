package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector4
  extends StObject
     with Vector {
  
  def add(v: Vector4): Vector4 = js.native
  
  def addScalar(s: Double): Vector4 = js.native
  
  def addVectors(a: Vector4, b: Vector4): Vector4 = js.native
  
  def applyMatrix4(m: Matrix4): Vector4 = js.native
  
  def ceil(): Vector4 = js.native
  
  def clamp(min: Vector4, max: Vector4): Vector4 = js.native
  
  def clampScalar(min: Double, max: Double): Vector4 = js.native
  
  def copy(v: Vector4): Vector4 = js.native
  
  def dot(v: Vector4): Double = js.native
  
  def equals(v: Vector4): Boolean = js.native
  
  def floor(): Vector4 = js.native
  
  def fromArray(xyzw: js.Array[Double]): Vector4 = js.native
  def fromArray(xyzw: js.Array[Double], offset: Double): Vector4 = js.native
  
  def fromAttribute(attribute: BufferAttribute, index: Double): Vector4 = js.native
  def fromAttribute(attribute: BufferAttribute, index: Double, offset: Double): Vector4 = js.native
  
  def lengthManhattan(): Double = js.native
  
  def lerp(v: Vector4, alpha: Double): Vector4 = js.native
  
  def lerpVectors(v1: Vector4, v2: Vector4, alpha: Double): Vector4 = js.native
  
  def max(v: Vector4): Vector4 = js.native
  
  def min(v: Vector4): Vector4 = js.native
  
  def round(): Vector4 = js.native
  
  def roundToZero(): Vector4 = js.native
  
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  
  def setAxisAngleFromQuaternion(q: Quaternion): Vector4 = js.native
  
  def setAxisAngleFromRotationMatrix(m: Matrix3): Vector4 = js.native
  
  def setW(w: Double): Vector4 = js.native
  
  def setX(x: Double): Vector4 = js.native
  
  def setY(y: Double): Vector4 = js.native
  
  def setZ(z: Double): Vector4 = js.native
  
  def sub(v: Vector4): Vector4 = js.native
  
  def subScalar(s: Double): Vector4 = js.native
  
  def subVectors(a: Vector4, b: Vector4): Vector4 = js.native
  
  def toArray(): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def toArray(xyzw: Unit, offset: Double): js.Array[Double] = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
