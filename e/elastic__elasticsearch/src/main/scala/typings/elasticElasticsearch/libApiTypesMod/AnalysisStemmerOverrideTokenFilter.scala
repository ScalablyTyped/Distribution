package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.stemmer_override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStemmerOverrideTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var rules: js.UndefOr[js.Array[String]] = js.undefined
  
  var rules_path: js.UndefOr[String] = js.undefined
  
  var `type`: stemmer_override
}
object AnalysisStemmerOverrideTokenFilter {
  
  inline def apply(): AnalysisStemmerOverrideTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stemmer_override")
    __obj.asInstanceOf[AnalysisStemmerOverrideTokenFilter]
  }
  
  extension [Self <: AnalysisStemmerOverrideTokenFilter](x: Self) {
    
    inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setRules_path(value: String): Self = StObject.set(x, "rules_path", value.asInstanceOf[js.Any])
    
    inline def setRules_pathUndefined: Self = StObject.set(x, "rules_path", js.undefined)
    
    inline def setType(value: stemmer_override): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
