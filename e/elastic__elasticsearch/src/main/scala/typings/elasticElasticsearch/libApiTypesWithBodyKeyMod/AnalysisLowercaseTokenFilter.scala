package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.lowercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLowercaseTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var language: js.UndefOr[String] = js.undefined
  
  var `type`: lowercase
}
object AnalysisLowercaseTokenFilter {
  
  inline def apply(): AnalysisLowercaseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[AnalysisLowercaseTokenFilter]
  }
  
  extension [Self <: AnalysisLowercaseTokenFilter](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setType(value: lowercase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
