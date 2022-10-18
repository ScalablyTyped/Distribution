package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_folding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuFoldingTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: icu_folding
  
  var unicode_set_filter: String
}
object AnalysisIcuFoldingTokenFilter {
  
  inline def apply(unicode_set_filter: String): AnalysisIcuFoldingTokenFilter = {
    val __obj = js.Dynamic.literal(unicode_set_filter = unicode_set_filter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_folding")
    __obj.asInstanceOf[AnalysisIcuFoldingTokenFilter]
  }
  
  extension [Self <: AnalysisIcuFoldingTokenFilter](x: Self) {
    
    inline def setType(value: icu_folding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnicode_set_filter(value: String): Self = StObject.set(x, "unicode_set_filter", value.asInstanceOf[js.Any])
  }
}
