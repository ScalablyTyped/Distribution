package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSearchResponse[T] extends js.Object {
  
  var responses: js.UndefOr[js.Array[SearchResponse[T]]] = js.native
}
object MSearchResponse {
  
  @scala.inline
  def apply[T](): MSearchResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchResponse[T]]
  }
  
  @scala.inline
  implicit class MSearchResponseOps[Self <: MSearchResponse[_], T] (val x: Self with MSearchResponse[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResponsesVarargs(value: SearchResponse[T]*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[SearchResponse[T]]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
}
