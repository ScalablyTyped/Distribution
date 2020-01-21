package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEventAttachment extends js.Object {
  /**
    * ID of the attached file. Read-only. For Google Drive files, this is the
    * ID of the corresponding Files resource entry in the Drive API.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * URL link to the attachment. For adding Google Drive file attachments use
    * the same format as in alternateLink property of the Files resource in the
    * Drive API. Required when adding an attachment.
    */
  var fileUrl: js.UndefOr[String] = js.native
  /**
    * URL link to the attachment&#39;s icon. Read-only.
    */
  var iconLink: js.UndefOr[String] = js.native
  /**
    * Internet media type (MIME type) of the attachment.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Attachment title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaEventAttachment {
  @scala.inline
  def apply(
    fileId: String = null,
    fileUrl: String = null,
    iconLink: String = null,
    mimeType: String = null,
    title: String = null
  ): SchemaEventAttachment = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileUrl != null) __obj.updateDynamic("fileUrl")(fileUrl.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventAttachment]
  }
}

