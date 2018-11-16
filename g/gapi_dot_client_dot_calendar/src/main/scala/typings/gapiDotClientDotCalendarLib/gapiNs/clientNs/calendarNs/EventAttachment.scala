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

