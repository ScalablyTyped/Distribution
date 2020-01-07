package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersAcknowledgeRequest extends js.Object {
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
}

object Schema$OrdersAcknowledgeRequest {
  @scala.inline
  def apply(operationId: String = null): Schema$OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersAcknowledgeRequest]
  }
}

