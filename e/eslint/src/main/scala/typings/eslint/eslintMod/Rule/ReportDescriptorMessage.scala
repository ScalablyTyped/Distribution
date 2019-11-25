package typings.eslint.eslintMod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.Anon_Message
  - typings.eslint.Anon_MessageId
*/
trait ReportDescriptorMessage extends js.Object

object ReportDescriptorMessage {
  @scala.inline
  def Anon_Message(message: String): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
  @scala.inline
  def Anon_MessageId(messageId: String): ReportDescriptorMessage = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorMessage]
  }
}

