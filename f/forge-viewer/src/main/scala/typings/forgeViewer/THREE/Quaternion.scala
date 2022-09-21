package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quaternion extends StObject {
  
  def conjugate(): Quaternion = js.native
  
  def copy(q: Quaternion): Quaternion = js.native
  
  def dot(v: Vector3): Double = js.native
  
  def equals(v: Quaternion): Boolean = js.native
  
  def fromArray(xyzw: js.Array[Double]): Quaternion = js.native
  def fromArray(xyzw: js.Array[Double], offset: Double): Quaternion = js.native
  
  def inverse(): Quaternion = js.native
  
  def length(): Double = js.native
  
  def lengthSq(): Double = js.native
  
  def multiply(q: Quaternion): Quaternion = js.native
  
  def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
  
  def multiplyVector3(vector: Vector3): Vector3 = js.native
  
  def normalize(): Quaternion = js.native
  
  def onChange(): Unit = js.native
  
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  
  def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
  
  def setFromEuler(euler: Euler): Quaternion = js.native
  def setFromEuler(euler: Euler, update: Boolean): Quaternion = js.native
  
  def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
  
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
  
  def slerp(qb: Quaternion, t: Double): Quaternion = js.native
  
  def toArray(): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xyzw: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def toArray(xyzw: Unit, offset: Double): js.Array[Double] = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
