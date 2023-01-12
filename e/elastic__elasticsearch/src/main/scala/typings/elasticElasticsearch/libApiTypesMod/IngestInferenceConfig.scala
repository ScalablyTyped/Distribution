package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestInferenceConfig extends StObject {
  
  var classification: js.UndefOr[IngestInferenceConfigClassification] = js.undefined
  
  var regression: js.UndefOr[IngestInferenceConfigRegression] = js.undefined
}
object IngestInferenceConfig {
  
  inline def apply(): IngestInferenceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestInferenceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestInferenceConfig] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: IngestInferenceConfigClassification): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setRegression(value: IngestInferenceConfigRegression): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
  }
}
