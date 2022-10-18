package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisRegression
  extends StObject
     with MlDataframeAnalysis {
  
  var loss_function: js.UndefOr[String] = js.undefined
  
  var loss_function_parameter: js.UndefOr[double] = js.undefined
}
object MlDataframeAnalysisRegression {
  
  inline def apply(dependent_variable: String): MlDataframeAnalysisRegression = {
    val __obj = js.Dynamic.literal(dependent_variable = dependent_variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisRegression]
  }
  
  extension [Self <: MlDataframeAnalysisRegression](x: Self) {
    
    inline def setLoss_function(value: String): Self = StObject.set(x, "loss_function", value.asInstanceOf[js.Any])
    
    inline def setLoss_functionUndefined: Self = StObject.set(x, "loss_function", js.undefined)
    
    inline def setLoss_function_parameter(value: double): Self = StObject.set(x, "loss_function_parameter", value.asInstanceOf[js.Any])
    
    inline def setLoss_function_parameterUndefined: Self = StObject.set(x, "loss_function_parameter", js.undefined)
  }
}
