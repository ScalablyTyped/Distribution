package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromTextResponse extends js.Object {
  var candidates: js.Array[stdLib.Partial[PlaceSearchResult]]
  var status: SearchResponseStatus
}

object FindPlaceFromTextResponse {
  @scala.inline
  def apply(candidates: js.Array[stdLib.Partial[PlaceSearchResult]], status: SearchResponseStatus): FindPlaceFromTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("candidates")(candidates)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[FindPlaceFromTextResponse]
  }
}

