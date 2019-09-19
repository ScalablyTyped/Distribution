package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailAdvancedOptions extends js.Object {
  /**
    * An array of files to send with the email.
    */
  var attachments: js.UndefOr[js.Array[BlobSource]] = js.undefined
  /**
    * A comma-separated list of email addresses to BCC.
    */
  var bcc: js.UndefOr[String] = js.undefined
  /**
    * A comma-separated list of email addresses to CC.
    */
  var cc: js.UndefOr[String] = js.undefined
  /**
    * The address that the email should be sent from, which must be one of the values returned by `GmailApp.getAliases()`.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * If set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional `inlineImages` field in HTML body if you have inlined images for your email.
    */
  var htmlBody: js.UndefOr[String] = js.undefined
  /**
    * A JavaScript object containing a mapping from image key (`String`) to image data (`BlobSource`) ; this assumes that the `htmlBody` parameter is used and contains references to these images in the format `<img src="cid:imageKey" />`.
    */
  var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.undefined
  /**
    * The name of the sender of the email (default: the user's name).
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * An email address to use as the default reply-to address (default: the user's email address).
    */
  var replyTo: js.UndefOr[String] = js.undefined
}

object GmailAdvancedOptions {
  @scala.inline
  def apply(
    attachments: js.Array[BlobSource] = null,
    bcc: String = null,
    cc: String = null,
    from: String = null,
    htmlBody: String = null,
    inlineImages: StringDictionary[BlobSource] = null,
    name: String = null,
    replyTo: String = null
  ): GmailAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (from != null) __obj.updateDynamic("from")(from)
    if (htmlBody != null) __obj.updateDynamic("htmlBody")(htmlBody)
    if (inlineImages != null) __obj.updateDynamic("inlineImages")(inlineImages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    __obj.asInstanceOf[GmailAdvancedOptions]
  }
}

