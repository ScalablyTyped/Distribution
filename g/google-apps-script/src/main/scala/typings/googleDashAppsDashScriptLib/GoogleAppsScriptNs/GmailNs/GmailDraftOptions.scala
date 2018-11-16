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
    ScalablyTyped.runtime.StringDictionary[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource]
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

