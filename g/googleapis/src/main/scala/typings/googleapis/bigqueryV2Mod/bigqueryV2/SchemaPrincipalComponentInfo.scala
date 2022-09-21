package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrincipalComponentInfo extends StObject {
  
  /**
    * The explained_variance is pre-ordered in the descending order to compute the cumulative explained variance ratio.
    */
  var cumulativeExplainedVarianceRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Explained variance by this principal component, which is simply the eigenvalue.
    */
  var explainedVariance: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Explained_variance over the total explained variance.
    */
  var explainedVarianceRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Id of the principal component.
    */
  var principalComponentId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrincipalComponentInfo {
  
  inline def apply(): SchemaPrincipalComponentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipalComponentInfo]
  }
  
  extension [Self <: SchemaPrincipalComponentInfo](x: Self) {
    
    inline def setCumulativeExplainedVarianceRatio(value: Double): Self = StObject.set(x, "cumulativeExplainedVarianceRatio", value.asInstanceOf[js.Any])
    
    inline def setCumulativeExplainedVarianceRatioNull: Self = StObject.set(x, "cumulativeExplainedVarianceRatio", null)
    
    inline def setCumulativeExplainedVarianceRatioUndefined: Self = StObject.set(x, "cumulativeExplainedVarianceRatio", js.undefined)
    
    inline def setExplainedVariance(value: Double): Self = StObject.set(x, "explainedVariance", value.asInstanceOf[js.Any])
    
    inline def setExplainedVarianceNull: Self = StObject.set(x, "explainedVariance", null)
    
    inline def setExplainedVarianceRatio(value: Double): Self = StObject.set(x, "explainedVarianceRatio", value.asInstanceOf[js.Any])
    
    inline def setExplainedVarianceRatioNull: Self = StObject.set(x, "explainedVarianceRatio", null)
    
    inline def setExplainedVarianceRatioUndefined: Self = StObject.set(x, "explainedVarianceRatio", js.undefined)
    
    inline def setExplainedVarianceUndefined: Self = StObject.set(x, "explainedVariance", js.undefined)
    
    inline def setPrincipalComponentId(value: String): Self = StObject.set(x, "principalComponentId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalComponentIdNull: Self = StObject.set(x, "principalComponentId", null)
    
    inline def setPrincipalComponentIdUndefined: Self = StObject.set(x, "principalComponentId", js.undefined)
  }
}
