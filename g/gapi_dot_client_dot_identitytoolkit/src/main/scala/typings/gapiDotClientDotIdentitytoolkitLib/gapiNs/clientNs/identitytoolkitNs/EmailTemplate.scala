package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplate extends js.Object {
  /** Email body. */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** Email body format. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** From address of the email. */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /** From display name. */
  var fromDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** Reply-to address. */
  var replyTo: js.UndefOr[java.lang.String] = js.undefined
  /** Subject of the email. */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object EmailTemplate {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    format: java.lang.String = null,
    from: java.lang.String = null,
    fromDisplayName: java.lang.String = null,
    replyTo: java.lang.String = null,
    subject: java.lang.String = null
  ): EmailTemplate = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (format != null) __obj.updateDynamic("format")(format)
    if (from != null) __obj.updateDynamic("from")(from)
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[EmailTemplate]
  }
}

