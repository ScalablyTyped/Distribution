package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix4 extends StObject {
  
  def applyToVector3Array(array: js.Array[Double]): js.Array[Double] = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double, length: Double): js.Array[Double] = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Unit, length: Double): js.Array[Double] = js.native
  
  def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
  
  def copy(m: Matrix4): Matrix4 = js.native
  
  def copyPosition(m: Matrix4): Matrix4 = js.native
  
  def decompose(): js.Array[js.Object] = js.native
  def decompose(translation: Unit, rotation: Unit, scale: Vector3): js.Array[js.Object] = js.native
  def decompose(translation: Unit, rotation: Quaternion): js.Array[js.Object] = js.native
  def decompose(translation: Unit, rotation: Quaternion, scale: Vector3): js.Array[js.Object] = js.native
  def decompose(translation: Vector3): js.Array[js.Object] = js.native
  def decompose(translation: Vector3, rotation: Unit, scale: Vector3): js.Array[js.Object] = js.native
  def decompose(translation: Vector3, rotation: Quaternion): js.Array[js.Object] = js.native
  def decompose(translation: Vector3, rotation: Quaternion, scale: Vector3): js.Array[js.Object] = js.native
  
  def determinant(): Double = js.native
  
  var elements: js.typedarray.Float32Array = js.native
  
  def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
  
  def extractRotation(m: Matrix4): Matrix4 = js.native
  
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  
  def getInverse(m: Matrix4): Matrix4 = js.native
  def getInverse(m: Matrix4, throwOnInvertible: Boolean): Matrix4 = js.native
  
  def getMaxScaleOnAxis(): Double = js.native
  
  def identity(): Matrix4 = js.native
  
  def invert(): Matrix4 = js.native
  
  def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = js.native
  
  def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
  
  def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = js.native
  
  def makeRotationFromEuler(euler: Euler): Matrix4 = js.native
  
  def makeRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
  
  def makeRotationX(theta: Double): Matrix4 = js.native
  
  def makeRotationY(theta: Double): Matrix4 = js.native
  
  def makeRotationZ(theta: Double): Matrix4 = js.native
  
  def makeScale(x: Double, y: Double, z: Double): Matrix4 = js.native
  
  def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.native
  
  def multiply(m: Matrix4): Matrix4 = js.native
  
  def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = js.native
  
  def multiplyScalar(s: Double): Matrix4 = js.native
  
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = js.native
  
  def scale(v: Vector3): Matrix4 = js.native
  
  def set(
    n11: Double,
    n12: Double,
    n13: Double,
    n14: Double,
    n21: Double,
    n22: Double,
    n23: Double,
    n24: Double,
    n31: Double,
    n32: Double,
    n33: Double,
    n34: Double,
    n41: Double,
    n42: Double,
    n43: Double,
    n44: Double
  ): Matrix4 = js.native
  
  def setPosition(v: Vector3): Matrix4 = js.native
  
  def transpose(): Matrix4 = js.native
}
