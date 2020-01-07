package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CreateOrdersRequest extends js.Object {
  /**
    * The list of proposals to create.
    */
  var proposals: js.UndefOr[js.Array[Schema$Proposal]] = js.native
  /**
    * Web property id of the seller creating these orders
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object Schema$CreateOrdersRequest {
  @scala.inline
  def apply(proposals: js.Array[Schema$Proposal] = null, webPropertyCode: String = null): Schema$CreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateOrdersRequest]
  }
}

