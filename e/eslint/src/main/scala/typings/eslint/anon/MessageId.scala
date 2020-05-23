package typings.eslint.anon

import typings.eslint.mod.Rule.ReportDescriptorMessage
import typings.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageId
  extends ReportDescriptorMessage
     with SuggestionDescriptorMessage {
  var messageId: String
}

object MessageId {
  @scala.inline
  def apply(messageId: String): MessageId = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
}

