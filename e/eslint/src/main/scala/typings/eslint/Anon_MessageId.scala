package typings.eslint

import typings.eslint.eslintMod.Rule.ReportDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageId extends ReportDescriptorMessage {
  var messageId: String
}

object Anon_MessageId {
  @scala.inline
  def apply(messageId: String): Anon_MessageId = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MessageId]
  }
}

