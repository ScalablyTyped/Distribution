package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix3
  extends StObject
     with Matrix {
  
  def applyToVector3Array(array: js.Array[Double]): js.Array[Double] = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double, length: Double): js.Array[Double] = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Unit, length: Double): js.Array[Double] = js.native
  
  def copy(m: Matrix3): Matrix3 = js.native
  
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  
  def getInverse(matrix: Matrix3): Matrix3 = js.native
  def getInverse(matrix: Matrix3, throwOnInvertible: Boolean): Matrix3 = js.native
  def getInverse(matrix: Matrix4): Matrix3 = js.native
  def getInverse(matrix: Matrix4, throwOnInvertible: Boolean): Matrix3 = js.native
  
  def getNormalMatrix(m: Matrix4): Matrix3 = js.native
  
  def set(
    n11: Double,
    n12: Double,
    n13: Double,
    n21: Double,
    n22: Double,
    n23: Double,
    n31: Double,
    n32: Double,
    n33: Double
  ): Matrix3 = js.native
  
  def toArray(): js.Array[Double] = js.native
  
  def transposeIntoArray(r: js.Array[Double]): js.Array[Double] = js.native
}
