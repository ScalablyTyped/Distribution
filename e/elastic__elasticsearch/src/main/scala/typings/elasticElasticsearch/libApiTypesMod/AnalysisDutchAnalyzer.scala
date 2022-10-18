package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dutch_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisDutchAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var `type`: dutch_
}
object AnalysisDutchAnalyzer {
  
  inline def apply(): AnalysisDutchAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dutch")
    __obj.asInstanceOf[AnalysisDutchAnalyzer]
  }
  
  extension [Self <: AnalysisDutchAnalyzer](x: Self) {
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setType(value: dutch_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
