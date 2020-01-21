package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

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
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileUrl != null) __obj.updateDynamic("fileUrl")(fileUrl.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAttachment]
  }
}

