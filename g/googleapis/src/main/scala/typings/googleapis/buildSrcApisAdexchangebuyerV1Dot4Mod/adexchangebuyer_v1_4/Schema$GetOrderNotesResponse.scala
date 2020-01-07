package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetOrderNotesResponse extends js.Object {
  /**
    * The list of matching notes. The notes for a proposal are ordered from
    * oldest to newest. If the notes span multiple proposals, they will be
    * grouped by proposal, with the notes for the most recently modified
    * proposal appearing first.
    */
  var notes: js.UndefOr[js.Array[Schema$MarketplaceNote]] = js.native
}

object Schema$GetOrderNotesResponse {
  @scala.inline
  def apply(notes: js.Array[Schema$MarketplaceNote] = null): Schema$GetOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOrderNotesResponse]
  }
}

