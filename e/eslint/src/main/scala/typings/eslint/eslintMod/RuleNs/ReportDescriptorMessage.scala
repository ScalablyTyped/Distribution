package typings.eslint.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorMessage extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[String] = js.undefined
}

object ReportDescriptorMessage {
  @scala.inline
  def apply(message: String = null, messageId: String = null): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
}

