package typings.googleMaps.mod

import typings.googleMaps.PartialPlaceSearchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromTextResponse extends js.Object {
  var candidates: js.Array[PartialPlaceSearchResult]
  var status: SearchResponseStatus
}

object FindPlaceFromTextResponse {
  @scala.inline
  def apply(candidates: js.Array[PartialPlaceSearchResult], status: SearchResponseStatus): FindPlaceFromTextResponse = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FindPlaceFromTextResponse]
  }
}

