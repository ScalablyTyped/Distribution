package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArimaCoefficients extends StObject {
  
  /**
    * Auto-regressive coefficients, an array of double.
    */
  var autoRegressiveCoefficients: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Intercept coefficient, just a double not an array.
    */
  var interceptCoefficient: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Moving-average coefficients, an array of double.
    */
  var movingAverageCoefficients: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaArimaCoefficients {
  
  inline def apply(): SchemaArimaCoefficients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArimaCoefficients]
  }
  
  extension [Self <: SchemaArimaCoefficients](x: Self) {
    
    inline def setAutoRegressiveCoefficients(value: js.Array[Double]): Self = StObject.set(x, "autoRegressiveCoefficients", value.asInstanceOf[js.Any])
    
    inline def setAutoRegressiveCoefficientsNull: Self = StObject.set(x, "autoRegressiveCoefficients", null)
    
    inline def setAutoRegressiveCoefficientsUndefined: Self = StObject.set(x, "autoRegressiveCoefficients", js.undefined)
    
    inline def setAutoRegressiveCoefficientsVarargs(value: Double*): Self = StObject.set(x, "autoRegressiveCoefficients", js.Array(value*))
    
    inline def setInterceptCoefficient(value: Double): Self = StObject.set(x, "interceptCoefficient", value.asInstanceOf[js.Any])
    
    inline def setInterceptCoefficientNull: Self = StObject.set(x, "interceptCoefficient", null)
    
    inline def setInterceptCoefficientUndefined: Self = StObject.set(x, "interceptCoefficient", js.undefined)
    
    inline def setMovingAverageCoefficients(value: js.Array[Double]): Self = StObject.set(x, "movingAverageCoefficients", value.asInstanceOf[js.Any])
    
    inline def setMovingAverageCoefficientsNull: Self = StObject.set(x, "movingAverageCoefficients", null)
    
    inline def setMovingAverageCoefficientsUndefined: Self = StObject.set(x, "movingAverageCoefficients", js.undefined)
    
    inline def setMovingAverageCoefficientsVarargs(value: Double*): Self = StObject.set(x, "movingAverageCoefficients", js.Array(value*))
  }
}
