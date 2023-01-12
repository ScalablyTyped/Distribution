package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.pattern_capture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPatternCaptureTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var patterns: js.Array[String]
  
  var preserve_original: js.UndefOr[Boolean] = js.undefined
  
  var `type`: pattern_capture
}
object AnalysisPatternCaptureTokenFilter {
  
  inline def apply(patterns: js.Array[String]): AnalysisPatternCaptureTokenFilter = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_capture")
    __obj.asInstanceOf[AnalysisPatternCaptureTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisPatternCaptureTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setPreserve_originalUndefined: Self = StObject.set(x, "preserve_original", js.undefined)
    
    inline def setType(value: pattern_capture): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
