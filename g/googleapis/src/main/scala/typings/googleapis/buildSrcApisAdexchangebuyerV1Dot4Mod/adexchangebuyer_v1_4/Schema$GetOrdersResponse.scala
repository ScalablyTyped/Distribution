package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetOrdersResponse extends js.Object {
  /**
    * The list of matching proposals.
    */
  var proposals: js.UndefOr[js.Array[Schema$Proposal]] = js.native
}

object Schema$GetOrdersResponse {
  @scala.inline
  def apply(proposals: js.Array[Schema$Proposal] = null): Schema$GetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOrdersResponse]
  }
}

