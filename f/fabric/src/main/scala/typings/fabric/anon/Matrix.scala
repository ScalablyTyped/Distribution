package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matrix extends StObject {
  
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
}
object Matrix {
  
  inline def apply(): Matrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matrix]
  }
  
  extension [Self <: Matrix](x: Self) {
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
  }
}
