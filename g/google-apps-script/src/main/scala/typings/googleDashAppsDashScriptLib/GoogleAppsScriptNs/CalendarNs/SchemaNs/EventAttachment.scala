package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAttachment extends js.Object {
  var fileId: js.UndefOr[java.lang.String] = js.undefined
  var fileUrl: js.UndefOr[java.lang.String] = js.undefined
  var iconLink: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
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

