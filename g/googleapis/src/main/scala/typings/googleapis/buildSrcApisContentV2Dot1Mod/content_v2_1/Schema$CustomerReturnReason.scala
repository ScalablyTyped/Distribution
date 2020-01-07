package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CustomerReturnReason extends js.Object {
  var description: js.UndefOr[String] = js.native
  var reasonCode: js.UndefOr[String] = js.native
}

object Schema$CustomerReturnReason {
  @scala.inline
  def apply(description: String = null, reasonCode: String = null): Schema$CustomerReturnReason = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerReturnReason]
  }
}

