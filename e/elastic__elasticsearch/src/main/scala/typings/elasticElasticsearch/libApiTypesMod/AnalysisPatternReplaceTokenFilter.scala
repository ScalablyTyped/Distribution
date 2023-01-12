package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.pattern_replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPatternReplaceTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var pattern: String
  
  var replacement: js.UndefOr[String] = js.undefined
  
  var `type`: pattern_replace
}
object AnalysisPatternReplaceTokenFilter {
  
  inline def apply(pattern: String): AnalysisPatternReplaceTokenFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[AnalysisPatternReplaceTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisPatternReplaceTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setType(value: pattern_replace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
