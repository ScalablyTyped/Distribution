package typings.emailTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<email-templates.email-templates.EmailMessage> */
trait PartialEmailMessage extends js.Object {
  var html: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PartialEmailMessage {
  @scala.inline
  def apply(html: String = null, subject: String = null, text: String = null): PartialEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEmailMessage]
  }
}

