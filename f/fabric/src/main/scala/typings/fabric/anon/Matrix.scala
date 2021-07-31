package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matrix extends StObject {
  
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
}
object Matrix {
  
  @scala.inline
  def apply(): Matrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matrix]
  }
  
  @scala.inline
  implicit class MatrixMutableBuilder[Self <: Matrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value :_*))
  }
}
