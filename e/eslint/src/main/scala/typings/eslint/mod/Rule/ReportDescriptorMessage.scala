package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.anon.Message
  - typings.eslint.anon.MessageId
*/
trait ReportDescriptorMessage extends js.Object

object ReportDescriptorMessage {
  @scala.inline
  def Message(message: String): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
  @scala.inline
  def MessageId(messageId: String): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
}

