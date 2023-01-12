package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsearchMultiSearchResult[TDocument] extends StObject {
  
  var responses: js.Array[MsearchResponseItem[TDocument]]
  
  var took: long
}
object MsearchMultiSearchResult {
  
  inline def apply[TDocument](responses: js.Array[MsearchResponseItem[TDocument]], took: long): MsearchMultiSearchResult[TDocument] = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsearchMultiSearchResult[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MsearchMultiSearchResult[?], TDocument] (val x: Self & MsearchMultiSearchResult[TDocument]) extends AnyVal {
    
    inline def setResponses(value: js.Array[MsearchResponseItem[TDocument]]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: MsearchResponseItem[TDocument]*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
  }
}
