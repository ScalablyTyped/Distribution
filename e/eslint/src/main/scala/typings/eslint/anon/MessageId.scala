package typings.eslint.anon

import typings.eslint.mod.Rule.ReportDescriptorMessage
import typings.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageId
  extends ReportDescriptorMessage
     with SuggestionDescriptorMessage {
  var messageId: String = js.native
}

object MessageId {
  @scala.inline
  def apply(messageId: String): MessageId = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
  @scala.inline
  implicit class MessageIdOps[Self <: MessageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
  }
  
}

