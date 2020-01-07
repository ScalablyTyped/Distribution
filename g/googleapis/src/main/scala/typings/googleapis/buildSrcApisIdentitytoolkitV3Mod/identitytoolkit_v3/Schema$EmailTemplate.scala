package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for an email template.
  */
@js.native
trait Schema$EmailTemplate extends js.Object {
  /**
    * Email body.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Email body format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * From address of the email.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * From display name.
    */
  var fromDisplayName: js.UndefOr[String] = js.native
  /**
    * Reply-to address.
    */
  var replyTo: js.UndefOr[String] = js.native
  /**
    * Subject of the email.
    */
  var subject: js.UndefOr[String] = js.native
}

object Schema$EmailTemplate {
  @scala.inline
  def apply(
    body: String = null,
    format: String = null,
    from: String = null,
    fromDisplayName: String = null,
    replyTo: String = null,
    subject: String = null
  ): Schema$EmailTemplate = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EmailTemplate]
  }
}

