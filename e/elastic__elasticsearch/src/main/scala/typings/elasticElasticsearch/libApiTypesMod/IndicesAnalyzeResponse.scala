package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeResponse extends StObject {
  
  var detail: js.UndefOr[IndicesAnalyzeAnalyzeDetail] = js.undefined
  
  var tokens: js.UndefOr[js.Array[IndicesAnalyzeAnalyzeToken]] = js.undefined
}
object IndicesAnalyzeResponse {
  
  inline def apply(): IndicesAnalyzeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyzeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAnalyzeResponse] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: IndicesAnalyzeAnalyzeDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setTokens(value: js.Array[IndicesAnalyzeAnalyzeToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: IndicesAnalyzeAnalyzeToken*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
