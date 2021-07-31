package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSearchResponse[T] extends StObject {
  
  var responses: js.UndefOr[js.Array[SearchResponse[T]]] = js.undefined
}
object MSearchResponse {
  
  @scala.inline
  def apply[T](): MSearchResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchResponse[T]]
  }
  
  @scala.inline
  implicit class MSearchResponseMutableBuilder[Self <: MSearchResponse[?], T] (val x: Self & MSearchResponse[T]) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SearchResponse[T]]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SearchResponse[T]*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
