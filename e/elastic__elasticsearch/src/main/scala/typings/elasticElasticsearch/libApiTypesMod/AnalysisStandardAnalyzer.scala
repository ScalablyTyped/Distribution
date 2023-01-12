package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStandardAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var max_token_length: js.UndefOr[integer] = js.undefined
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var `type`: standard
}
object AnalysisStandardAnalyzer {
  
  inline def apply(): AnalysisStandardAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[AnalysisStandardAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisStandardAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setMax_token_length(value: integer): Self = StObject.set(x, "max_token_length", value.asInstanceOf[js.Any])
    
    inline def setMax_token_lengthUndefined: Self = StObject.set(x, "max_token_length", js.undefined)
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setType(value: standard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
