package typings.googleMaps.mod

import typings.googleMaps.anon.PartialPlaceSearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPlaceFromTextResponse extends StObject {
  
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
  implicit class FindPlaceFromTextResponseMutableBuilder[Self <: FindPlaceFromTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[PartialPlaceSearchResult]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: PartialPlaceSearchResult*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: SearchResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
