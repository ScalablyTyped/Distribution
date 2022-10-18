package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.porter_stem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPorterStemTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: porter_stem
}
object AnalysisPorterStemTokenFilter {
  
  inline def apply(): AnalysisPorterStemTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("porter_stem")
    __obj.asInstanceOf[AnalysisPorterStemTokenFilter]
  }
  
  extension [Self <: AnalysisPorterStemTokenFilter](x: Self) {
    
    inline def setType(value: porter_stem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
