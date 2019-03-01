package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailDraftOptions extends js.Object {
  /**
    * An array of files to send with the email.
    */
  var attachments: js.UndefOr[js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource]] = js.undefined
  /**
    * A comma-separated list of email addresses to BCC.
    */
  var bcc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A comma-separated list of email addresses to CC.
    */
  var cc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The address that the email should be sent from, which must be one of the values returned by `GmailApp.getAliases()`.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional `inlineImages` field in HTML body if you have inlined images for your email.
    */
  var htmlBody: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A JavaScript object containing a mapping from image key (`String`) to image data (`BlobSource`) ; this assumes that the `htmlBody` parameter is used and contains references to these images in the format `<img src="cid:imageKey" />`.
    */
  var inlineImages: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource]
  ] = js.undefined
  /**
    * The name of the sender of the email (default: the user's name).
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An email address to use as the default reply-to address (default: the user's email address).
    */
  var replyTo: js.UndefOr[java.lang.String] = js.undefined
}

object GmailDraftOptions {
  @scala.inline
  def apply(
    attachments: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource] = null,
    bcc: java.lang.String = null,
    cc: java.lang.String = null,
    from: java.lang.String = null,
    htmlBody: java.lang.String = null,
    inlineImages: org.scalablytyped.runtime.StringDictionary[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource] = null,
    name: java.lang.String = null,
    replyTo: java.lang.String = null
  ): GmailDraftOptions = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (from != null) __obj.updateDynamic("from")(from)
    if (htmlBody != null) __obj.updateDynamic("htmlBody")(htmlBody)
    if (inlineImages != null) __obj.updateDynamic("inlineImages")(inlineImages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    __obj.asInstanceOf[GmailDraftOptions]
  }
}

