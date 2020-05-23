package typings.dialogflowFulfillment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawPayload extends js.Object {
  var rawPayload: js.UndefOr[Boolean] = js.undefined
  var sendAsMessage: js.UndefOr[Boolean] = js.undefined
}

object RawPayload {
  @scala.inline
  def apply(rawPayload: js.UndefOr[Boolean] = js.undefined, sendAsMessage: js.UndefOr[Boolean] = js.undefined): RawPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rawPayload)) __obj.updateDynamic("rawPayload")(rawPayload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsMessage)) __obj.updateDynamic("sendAsMessage")(sendAsMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawPayload]
  }
}

