package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSearchResponse[T] extends StObject {
  
  var responses: js.UndefOr[js.Array[SearchResponse[T]]] = js.undefined
}
object MSearchResponse {
  
  inline def apply[T](): MSearchResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchResponse[T]]
  }
  
  extension [Self <: MSearchResponse[?], T](x: Self & MSearchResponse[T]) {
    
    inline def setResponses(value: js.Array[SearchResponse[T]]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SearchResponse[T]*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
