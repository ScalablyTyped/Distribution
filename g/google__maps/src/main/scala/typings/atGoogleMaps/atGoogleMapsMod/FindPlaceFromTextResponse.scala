package typings.atGoogleMaps.atGoogleMapsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromTextResponse extends js.Object {
  var candidates: js.Array[Partial[PlaceSearchResult]]
  var status: SearchResponseStatus
}

object FindPlaceFromTextResponse {
  @scala.inline
  def apply(candidates: js.Array[Partial[PlaceSearchResult]], status: SearchResponseStatus): FindPlaceFromTextResponse = {
    val __obj = js.Dynamic.literal(candidates = candidates, status = status)
  
    __obj.asInstanceOf[FindPlaceFromTextResponse]
  }
}

