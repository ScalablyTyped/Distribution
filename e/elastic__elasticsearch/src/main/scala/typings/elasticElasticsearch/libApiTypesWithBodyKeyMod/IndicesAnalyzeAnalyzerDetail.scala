package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeAnalyzerDetail extends StObject {
  
  var name: String
  
  var tokens: js.Array[IndicesAnalyzeExplainAnalyzeToken]
}
object IndicesAnalyzeAnalyzerDetail {
  
  inline def apply(name: String, tokens: js.Array[IndicesAnalyzeExplainAnalyzeToken]): IndicesAnalyzeAnalyzerDetail = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeAnalyzerDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAnalyzeAnalyzerDetail] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[IndicesAnalyzeExplainAnalyzeToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: IndicesAnalyzeExplainAnalyzeToken*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
