package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AddOrderNotesResponse extends js.Object {
  var notes: js.UndefOr[js.Array[Schema$MarketplaceNote]] = js.native
}

object Schema$AddOrderNotesResponse {
  @scala.inline
  def apply(notes: js.Array[Schema$MarketplaceNote] = null): Schema$AddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddOrderNotesResponse]
  }
}

