package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_analyzer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var method: AnalysisIcuNormalizationType
  
  var mode: AnalysisIcuNormalizationMode
  
  var `type`: icu_analyzer
}
object AnalysisIcuAnalyzer {
  
  inline def apply(method: AnalysisIcuNormalizationType, mode: AnalysisIcuNormalizationMode): AnalysisIcuAnalyzer = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_analyzer")
    __obj.asInstanceOf[AnalysisIcuAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisIcuAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: AnalysisIcuNormalizationType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMode(value: AnalysisIcuNormalizationMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: icu_analyzer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
