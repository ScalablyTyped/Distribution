package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
  def copy(m: Matrix): Matrix = js.native
  
  def determinant(): Double = js.native
  
  var elements: js.typedarray.Float32Array = js.native
  
  def getInverse(matrix: Matrix): Matrix = js.native
  def getInverse(matrix: Matrix, throwOnInvertible: Boolean): Matrix = js.native
  
  def identity(): Matrix = js.native
  
  def multiplyScalar(s: Double): Matrix = js.native
  
  def transpose(): Matrix = js.native
}
