package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.stemmer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStemmerTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var language: String
  
  var `type`: stemmer
}
object AnalysisStemmerTokenFilter {
  
  inline def apply(language: String): AnalysisStemmerTokenFilter = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stemmer")
    __obj.asInstanceOf[AnalysisStemmerTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisStemmerTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setType(value: stemmer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
