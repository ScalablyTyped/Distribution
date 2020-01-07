package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a message in phishing spike alert.
  */
@js.native
trait Schema$GmailMessageInfo extends js.Object {
  /**
    * The `SHA256` hash of email&#39;s attachment and all MIME parts.
    */
  var attachmentsSha256Hash: js.UndefOr[js.Array[String]] = js.native
  /**
    * The date the malicious email was sent.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The hash of the message body text.
    */
  var md5HashMessageBody: js.UndefOr[String] = js.native
  /**
    * The MD5 Hash of email&#39;s subject (only available for reported emails).
    */
  var md5HashSubject: js.UndefOr[String] = js.native
  /**
    * The snippet of the message body text (only available for reported
    * emails).
    */
  var messageBodySnippet: js.UndefOr[String] = js.native
  /**
    * The message ID.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The recipient of this email.
    */
  var recipient: js.UndefOr[String] = js.native
  /**
    * The email subject text (only available for reported emails).
    */
  var subjectText: js.UndefOr[String] = js.native
}

object Schema$GmailMessageInfo {
  @scala.inline
  def apply(
    attachmentsSha256Hash: js.Array[String] = null,
    date: String = null,
    md5HashMessageBody: String = null,
    md5HashSubject: String = null,
    messageBodySnippet: String = null,
    messageId: String = null,
    recipient: String = null,
    subjectText: String = null
  ): Schema$GmailMessageInfo = {
    val __obj = js.Dynamic.literal()
    if (attachmentsSha256Hash != null) __obj.updateDynamic("attachmentsSha256Hash")(attachmentsSha256Hash.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (md5HashMessageBody != null) __obj.updateDynamic("md5HashMessageBody")(md5HashMessageBody.asInstanceOf[js.Any])
    if (md5HashSubject != null) __obj.updateDynamic("md5HashSubject")(md5HashSubject.asInstanceOf[js.Any])
    if (messageBodySnippet != null) __obj.updateDynamic("messageBodySnippet")(messageBodySnippet.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (subjectText != null) __obj.updateDynamic("subjectText")(subjectText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmailMessageInfo]
  }
}

