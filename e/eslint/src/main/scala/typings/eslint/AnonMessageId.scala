package typings.eslint

import typings.eslint.mod.Rule.ReportDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageId extends ReportDescriptorMessage {
  var messageId: String
}

object AnonMessageId {
  @scala.inline
  def apply(messageId: String): AnonMessageId = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessageId]
  }
}

