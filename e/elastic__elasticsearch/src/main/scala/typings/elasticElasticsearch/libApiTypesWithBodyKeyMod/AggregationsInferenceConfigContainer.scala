package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsInferenceConfigContainer extends StObject {
  
  var classification: js.UndefOr[MlClassificationInferenceOptions] = js.undefined
  
  var regression: js.UndefOr[MlRegressionInferenceOptions] = js.undefined
}
object AggregationsInferenceConfigContainer {
  
  inline def apply(): AggregationsInferenceConfigContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsInferenceConfigContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsInferenceConfigContainer] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: MlClassificationInferenceOptions): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setRegression(value: MlRegressionInferenceOptions): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
  }
}
