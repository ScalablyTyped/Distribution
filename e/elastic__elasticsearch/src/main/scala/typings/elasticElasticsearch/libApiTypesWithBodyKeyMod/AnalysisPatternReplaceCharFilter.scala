package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.pattern_replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPatternReplaceCharFilter
  extends StObject
     with AnalysisCharFilterBase
     with AnalysisCharFilterDefinition {
  
  var flags: js.UndefOr[String] = js.undefined
  
  var pattern: String
  
  var replacement: js.UndefOr[String] = js.undefined
  
  var `type`: pattern_replace
}
object AnalysisPatternReplaceCharFilter {
  
  inline def apply(pattern: String): AnalysisPatternReplaceCharFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[AnalysisPatternReplaceCharFilter]
  }
  
  extension [Self <: AnalysisPatternReplaceCharFilter](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setType(value: pattern_replace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
