package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dictionary_decompounder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisDictionaryDecompounderTokenFilter
  extends StObject
     with AnalysisCompoundWordTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: dictionary_decompounder
}
object AnalysisDictionaryDecompounderTokenFilter {
  
  inline def apply(): AnalysisDictionaryDecompounderTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dictionary_decompounder")
    __obj.asInstanceOf[AnalysisDictionaryDecompounderTokenFilter]
  }
  
  extension [Self <: AnalysisDictionaryDecompounderTokenFilter](x: Self) {
    
    inline def setType(value: dictionary_decompounder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
