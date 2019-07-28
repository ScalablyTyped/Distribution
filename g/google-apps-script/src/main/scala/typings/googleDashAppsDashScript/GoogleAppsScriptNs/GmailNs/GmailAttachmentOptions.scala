package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailAttachmentOptions extends js.Object {
  /**
    *  If the returned array of Blob attachments should include regular (non-inline) attachments.
    */
  var includeAttachments: js.UndefOr[Boolean] = js.undefined
  /**
    * If the returned array of Blob attachments should include inline images.
    */
  var includeInlineImages: js.UndefOr[Boolean] = js.undefined
}

object GmailAttachmentOptions {
  @scala.inline
  def apply(
    includeAttachments: js.UndefOr[Boolean] = js.undefined,
    includeInlineImages: js.UndefOr[Boolean] = js.undefined
  ): GmailAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttachments)) __obj.updateDynamic("includeAttachments")(includeAttachments)
    if (!js.isUndefined(includeInlineImages)) __obj.updateDynamic("includeInlineImages")(includeInlineImages)
    __obj.asInstanceOf[GmailAttachmentOptions]
  }
}

