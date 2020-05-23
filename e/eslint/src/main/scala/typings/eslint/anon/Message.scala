package typings.eslint.anon

import typings.eslint.mod.Rule.ReportDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends ReportDescriptorMessage {
  var message: String
}

object Message {
  @scala.inline
  def apply(message: String): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

