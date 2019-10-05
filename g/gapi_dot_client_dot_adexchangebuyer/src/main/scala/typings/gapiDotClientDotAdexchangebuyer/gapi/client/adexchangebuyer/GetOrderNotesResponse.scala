package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrderNotesResponse extends js.Object {
  /**
    * The list of matching notes. The notes for a proposal are ordered from oldest to newest. If the notes span multiple proposals, they will be grouped by
    * proposal, with the notes for the most recently modified proposal appearing first.
    */
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}

object GetOrderNotesResponse {
  @scala.inline
  def apply(notes: js.Array[MarketplaceNote] = null): GetOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[GetOrderNotesResponse]
  }
}

