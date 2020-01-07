package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersRejectReturnLineItemResponse extends js.Object {
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersRejectReturnLineItemResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OrdersRejectReturnLineItemResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): Schema$OrdersRejectReturnLineItemResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersRejectReturnLineItemResponse]
  }
}

