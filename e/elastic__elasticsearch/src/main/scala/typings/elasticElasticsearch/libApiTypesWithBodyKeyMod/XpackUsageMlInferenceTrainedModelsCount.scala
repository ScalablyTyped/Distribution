package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInferenceTrainedModelsCount extends StObject {
  
  var classification: js.UndefOr[long] = js.undefined
  
  var ner: js.UndefOr[long] = js.undefined
  
  var other: long
  
  var pass_through: js.UndefOr[long] = js.undefined
  
  var prepackaged: long
  
  var regression: js.UndefOr[long] = js.undefined
  
  var total: long
}
object XpackUsageMlInferenceTrainedModelsCount {
  
  inline def apply(other: long, prepackaged: long, total: long): XpackUsageMlInferenceTrainedModelsCount = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], prepackaged = prepackaged.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInferenceTrainedModelsCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInferenceTrainedModelsCount] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: long): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setNer(value: long): Self = StObject.set(x, "ner", value.asInstanceOf[js.Any])
    
    inline def setNerUndefined: Self = StObject.set(x, "ner", js.undefined)
    
    inline def setOther(value: long): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setPass_through(value: long): Self = StObject.set(x, "pass_through", value.asInstanceOf[js.Any])
    
    inline def setPass_throughUndefined: Self = StObject.set(x, "pass_through", js.undefined)
    
    inline def setPrepackaged(value: long): Self = StObject.set(x, "prepackaged", value.asInstanceOf[js.Any])
    
    inline def setRegression(value: long): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
