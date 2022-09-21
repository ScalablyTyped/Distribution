package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArimaFittingMetrics extends StObject {
  
  /**
    * AIC.
    */
  var aic: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Log-likelihood.
    */
  var logLikelihood: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Variance.
    */
  var variance: js.UndefOr[Double | Null] = js.undefined
}
object SchemaArimaFittingMetrics {
  
  inline def apply(): SchemaArimaFittingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArimaFittingMetrics]
  }
  
  extension [Self <: SchemaArimaFittingMetrics](x: Self) {
    
    inline def setAic(value: Double): Self = StObject.set(x, "aic", value.asInstanceOf[js.Any])
    
    inline def setAicNull: Self = StObject.set(x, "aic", null)
    
    inline def setAicUndefined: Self = StObject.set(x, "aic", js.undefined)
    
    inline def setLogLikelihood(value: Double): Self = StObject.set(x, "logLikelihood", value.asInstanceOf[js.Any])
    
    inline def setLogLikelihoodNull: Self = StObject.set(x, "logLikelihood", null)
    
    inline def setLogLikelihoodUndefined: Self = StObject.set(x, "logLikelihood", js.undefined)
    
    inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
