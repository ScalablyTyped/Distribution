package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorMessage extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var messageId: js.UndefOr[java.lang.String] = js.undefined
}

object ReportDescriptorMessage {
  @scala.inline
  def apply(message: java.lang.String = null, messageId: java.lang.String = null): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
}

