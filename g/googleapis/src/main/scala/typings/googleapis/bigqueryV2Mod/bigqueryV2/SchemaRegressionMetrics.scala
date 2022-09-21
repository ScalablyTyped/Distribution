package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegressionMetrics extends StObject {
  
  /**
    * Mean absolute error.
    */
  var meanAbsoluteError: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Mean squared error.
    */
  var meanSquaredError: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Mean squared log error.
    */
  var meanSquaredLogError: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Median absolute error.
    */
  var medianAbsoluteError: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * R^2 score. This corresponds to r2_score in ML.EVALUATE.
    */
  var rSquared: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRegressionMetrics {
  
  inline def apply(): SchemaRegressionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegressionMetrics]
  }
  
  extension [Self <: SchemaRegressionMetrics](x: Self) {
    
    inline def setMeanAbsoluteError(value: Double): Self = StObject.set(x, "meanAbsoluteError", value.asInstanceOf[js.Any])
    
    inline def setMeanAbsoluteErrorNull: Self = StObject.set(x, "meanAbsoluteError", null)
    
    inline def setMeanAbsoluteErrorUndefined: Self = StObject.set(x, "meanAbsoluteError", js.undefined)
    
    inline def setMeanSquaredError(value: Double): Self = StObject.set(x, "meanSquaredError", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredErrorNull: Self = StObject.set(x, "meanSquaredError", null)
    
    inline def setMeanSquaredErrorUndefined: Self = StObject.set(x, "meanSquaredError", js.undefined)
    
    inline def setMeanSquaredLogError(value: Double): Self = StObject.set(x, "meanSquaredLogError", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredLogErrorNull: Self = StObject.set(x, "meanSquaredLogError", null)
    
    inline def setMeanSquaredLogErrorUndefined: Self = StObject.set(x, "meanSquaredLogError", js.undefined)
    
    inline def setMedianAbsoluteError(value: Double): Self = StObject.set(x, "medianAbsoluteError", value.asInstanceOf[js.Any])
    
    inline def setMedianAbsoluteErrorNull: Self = StObject.set(x, "medianAbsoluteError", null)
    
    inline def setMedianAbsoluteErrorUndefined: Self = StObject.set(x, "medianAbsoluteError", js.undefined)
    
    inline def setRSquared(value: Double): Self = StObject.set(x, "rSquared", value.asInstanceOf[js.Any])
    
    inline def setRSquaredNull: Self = StObject.set(x, "rSquared", null)
    
    inline def setRSquaredUndefined: Self = StObject.set(x, "rSquared", js.undefined)
  }
}
