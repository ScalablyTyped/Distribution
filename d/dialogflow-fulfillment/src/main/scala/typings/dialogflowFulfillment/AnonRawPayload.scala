package typings.dialogflowFulfillment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRawPayload extends js.Object {
  var rawPayload: js.UndefOr[Boolean] = js.undefined
  var sendAsMessage: js.UndefOr[Boolean] = js.undefined
}

object AnonRawPayload {
  @scala.inline
  def apply(rawPayload: js.UndefOr[Boolean] = js.undefined, sendAsMessage: js.UndefOr[Boolean] = js.undefined): AnonRawPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rawPayload)) __obj.updateDynamic("rawPayload")(rawPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsMessage)) __obj.updateDynamic("sendAsMessage")(sendAsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRawPayload]
  }
}

