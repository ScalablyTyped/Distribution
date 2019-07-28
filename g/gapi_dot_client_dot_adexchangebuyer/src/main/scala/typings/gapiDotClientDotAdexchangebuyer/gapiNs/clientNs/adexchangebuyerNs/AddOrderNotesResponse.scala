package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOrderNotesResponse extends js.Object {
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}

object AddOrderNotesResponse {
  @scala.inline
  def apply(notes: js.Array[MarketplaceNote] = null): AddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[AddOrderNotesResponse]
  }
}

