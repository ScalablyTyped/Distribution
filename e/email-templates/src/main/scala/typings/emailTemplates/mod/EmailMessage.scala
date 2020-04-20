package typings.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailMessage extends js.Object {
  var html: String
  var subject: String
  var text: String
}

object EmailMessage {
  @scala.inline
  def apply(html: String, subject: String, text: String): EmailMessage = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessage]
  }
}

