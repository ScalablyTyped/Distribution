package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.kstem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKStemTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: kstem
}
object AnalysisKStemTokenFilter {
  
  inline def apply(): AnalysisKStemTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("kstem")
    __obj.asInstanceOf[AnalysisKStemTokenFilter]
  }
  
  extension [Self <: AnalysisKStemTokenFilter](x: Self) {
    
    inline def setType(value: kstem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
