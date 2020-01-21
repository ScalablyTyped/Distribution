package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplate extends js.Object {
  /** Email body. */
  var body: js.UndefOr[String] = js.undefined
  /** Email body format. */
  var format: js.UndefOr[String] = js.undefined
  /** From address of the email. */
  var from: js.UndefOr[String] = js.undefined
  /** From display name. */
  var fromDisplayName: js.UndefOr[String] = js.undefined
  /** Reply-to address. */
  var replyTo: js.UndefOr[String] = js.undefined
  /** Subject of the email. */
  var subject: js.UndefOr[String] = js.undefined
}

object EmailTemplate {
  @scala.inline
  def apply(
    body: String = null,
    format: String = null,
    from: String = null,
    fromDisplayName: String = null,
    replyTo: String = null,
    subject: String = null
  ): EmailTemplate = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplate]
  }
}

