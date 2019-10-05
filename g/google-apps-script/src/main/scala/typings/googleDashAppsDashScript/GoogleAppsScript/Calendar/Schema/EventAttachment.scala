package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAttachment extends js.Object {
  var fileId: js.UndefOr[String] = js.undefined
  var fileUrl: js.UndefOr[String] = js.undefined
  var iconLink: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object EventAttachment {
  @scala.inline
  def apply(
    fileId: String = null,
    fileUrl: String = null,
    iconLink: String = null,
    mimeType: String = null,
    title: String = null
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

