package typings.eslint

import typings.eslint.mod.Rule.ReportDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends ReportDescriptorMessage {
  var message: String
}

object AnonMessage {
  @scala.inline
  def apply(message: String): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

