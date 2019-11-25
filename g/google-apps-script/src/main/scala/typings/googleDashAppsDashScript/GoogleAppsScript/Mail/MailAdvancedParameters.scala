package typings.googleDashAppsDashScript.GoogleAppsScript.Mail

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailAdvancedParameters extends js.Object {
  /** an array of files to send with the email */
  var attachments: js.UndefOr[js.Array[BlobSource]] = js.undefined
  /** a comma-separated list of email addresses to BCC */
  var bcc: js.UndefOr[String] = js.undefined
  /** the body of the email */
  var body: js.UndefOr[String] = js.undefined
  /** a comma-separated list of email addresses to CC */
  var cc: js.UndefOr[String] = js.undefined
  /** if set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional inlineImages field in HTML body if you have inlined images for your email */
  var htmlBody: js.UndefOr[String] = js.undefined
  /** a JavaScript object containing a mapping from image key (String) to image data (BlobSource); this assumes that the htmlBody parameter is used and contains references to these images in the format <img src="cid:imageKey" /> */
  var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.undefined
  /** the name of the sender of the email (default: the user's name) */
  var name: js.UndefOr[String] = js.undefined
  /** true if the email should be sent from a generic no-reply email address to discourage recipients from responding to emails; this option is only possible for G Suite accounts, not Gmail users */
  var noReply: js.UndefOr[Boolean] = js.undefined
  /** an email address to use as the default reply-to address (default: the user's email address) */
  var replyTo: js.UndefOr[String] = js.undefined
  /** the subject of the email */
  var subject: js.UndefOr[String] = js.undefined
  /** the address of the recipient */
  var to: js.UndefOr[String] = js.undefined
}

object MailAdvancedParameters {
  @scala.inline
  def apply(
    attachments: js.Array[BlobSource] = null,
    bcc: String = null,
    body: String = null,
    cc: String = null,
    htmlBody: String = null,
    inlineImages: StringDictionary[BlobSource] = null,
    name: String = null,
    noReply: js.UndefOr[Boolean] = js.undefined,
    replyTo: String = null,
    subject: String = null,
    to: String = null
  ): MailAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (htmlBody != null) __obj.updateDynamic("htmlBody")(htmlBody.asInstanceOf[js.Any])
    if (inlineImages != null) __obj.updateDynamic("inlineImages")(inlineImages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noReply)) __obj.updateDynamic("noReply")(noReply.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailAdvancedParameters]
  }
}

