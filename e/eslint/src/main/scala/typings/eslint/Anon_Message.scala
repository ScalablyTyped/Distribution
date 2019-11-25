package typings.eslint

import typings.eslint.eslintMod.Rule.ReportDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends ReportDescriptorMessage {
  var message: String
}

object Anon_Message {
  @scala.inline
  def apply(message: String): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Message]
  }
}

