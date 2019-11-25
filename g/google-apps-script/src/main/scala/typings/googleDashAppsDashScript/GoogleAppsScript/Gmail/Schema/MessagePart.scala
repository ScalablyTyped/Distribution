package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePart extends js.Object {
  var body: js.UndefOr[MessagePartBody] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Array[MessagePartHeader]] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var partId: js.UndefOr[String] = js.undefined
  var parts: js.UndefOr[js.Array[MessagePart]] = js.undefined
}

object MessagePart {
  @scala.inline
  def apply(
    body: MessagePartBody = null,
    filename: String = null,
    headers: js.Array[MessagePartHeader] = null,
    mimeType: String = null,
    partId: String = null,
    parts: js.Array[MessagePart] = null
  ): MessagePart = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (partId != null) __obj.updateDynamic("partId")(partId.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePart]
  }
}

