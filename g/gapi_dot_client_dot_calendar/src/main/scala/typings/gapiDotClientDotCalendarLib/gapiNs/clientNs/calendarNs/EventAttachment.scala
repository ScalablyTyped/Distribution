package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAttachment extends js.Object {
  /**
    * ID of the attached file. Read-only.
    * For Google Drive files, this is the ID of the corresponding Files resource entry in the Drive API.
    */
  var fileId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL link to the attachment.
    * For adding Google Drive file attachments use the same format as in alternateLink property of the Files resource in the Drive API.
    */
  var fileUrl: js.UndefOr[java.lang.String] = js.undefined
  /** URL link to the attachment's icon. Read-only. */
  var iconLink: js.UndefOr[java.lang.String] = js.undefined
  /** Internet media type (MIME type) of the attachment. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** Attachment title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object EventAttachment {
  @scala.inline
  def apply(
    fileId: java.lang.String = null,
    fileUrl: java.lang.String = null,
    iconLink: java.lang.String = null,
    mimeType: java.lang.String = null,
    title: java.lang.String = null
  ): EventAttachment = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId)
    if (fileUrl != null) __obj.updateDynamic("fileUrl")(fileUrl)
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[EventAttachment]
  }
}

