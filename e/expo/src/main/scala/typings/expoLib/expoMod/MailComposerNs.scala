package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "MailComposer")
@js.native
object MailComposerNs extends js.Object {
  
  trait ComposeOptions extends js.Object {
    /** An array of app’s internal file uris to attach. */
    var attachments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /** An array of e-mail addressess of the BCC recipients. */
    var bccRecipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /** Body of the mail. */
    var body: js.UndefOr[java.lang.String] = js.undefined
    /** An array of e-mail addressess of the CC recipients. */
    var ccRecipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /** Whether the body contains HTML tags so it could be formatted properly. Not working perfectly on Android. */
    var isHtml: js.UndefOr[scala.Boolean] = js.undefined
    /** An array of e-mail addressess of the recipients. */
    var recipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /** Subject of the mail. */
    var subject: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /** Resolves to a promise with object containing status field that could be either sent, saved or cancelled. Android does not provide such info so it always resolves to sent. */
  def composeAsync(/** A map defining the data to fill the mail */
  options: ComposeOptions): js.Promise[expoLib.Anon_Status] = js.native
}

