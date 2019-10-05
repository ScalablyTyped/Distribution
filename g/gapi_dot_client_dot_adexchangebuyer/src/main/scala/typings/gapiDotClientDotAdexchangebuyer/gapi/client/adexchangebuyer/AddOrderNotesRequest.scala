package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOrderNotesRequest extends js.Object {
  /** The list of notes to add. */
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}

object AddOrderNotesRequest {
  @scala.inline
  def apply(notes: js.Array[MarketplaceNote] = null): AddOrderNotesRequest = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[AddOrderNotesRequest]
  }
}

