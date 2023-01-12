package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlAnalysisLimits extends StObject {
  
  var categorization_examples_limit: js.UndefOr[long] = js.undefined
  
  var model_memory_limit: js.UndefOr[String] = js.undefined
}
object MlAnalysisLimits {
  
  inline def apply(): MlAnalysisLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlAnalysisLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlAnalysisLimits] (val x: Self) extends AnyVal {
    
    inline def setCategorization_examples_limit(value: long): Self = StObject.set(x, "categorization_examples_limit", value.asInstanceOf[js.Any])
    
    inline def setCategorization_examples_limitUndefined: Self = StObject.set(x, "categorization_examples_limit", js.undefined)
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limitUndefined: Self = StObject.set(x, "model_memory_limit", js.undefined)
  }
}
