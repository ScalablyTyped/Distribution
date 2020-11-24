package typings.googleMaps.mod

import typings.googleMaps.anon.PartialPlaceSearchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPlaceFromTextResponse extends js.Object {
  
  var candidates: js.Array[PartialPlaceSearchResult] = js.native
  
  var status: SearchResponseStatus = js.native
}
object FindPlaceFromTextResponse {
  
  @scala.inline
  def apply(candidates: js.Array[PartialPlaceSearchResult], status: SearchResponseStatus): FindPlaceFromTextResponse = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromTextResponse]
  }
  
  @scala.inline
  implicit class FindPlaceFromTextResponseOps[Self <: FindPlaceFromTextResponse] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: PartialPlaceSearchResult*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[PartialPlaceSearchResult]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SearchResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
