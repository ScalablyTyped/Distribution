package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCustomBatchRequestEntryCancel extends js.Object {
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object Schema$OrdersCustomBatchRequestEntryCancel {
  @scala.inline
  def apply(reason: String = null, reasonText: String = null): Schema$OrdersCustomBatchRequestEntryCancel = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCustomBatchRequestEntryCancel]
  }
}

