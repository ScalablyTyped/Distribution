package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RefundReason extends js.Object {
  var description: js.UndefOr[String] = js.native
  var reasonCode: js.UndefOr[String] = js.native
}

object Schema$RefundReason {
  @scala.inline
  def apply(description: String = null, reasonCode: String = null): Schema$RefundReason = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RefundReason]
  }
}

