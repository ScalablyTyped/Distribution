package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePart extends js.Object {
  var body: js.UndefOr[MessagePartBody] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Array[MessagePartHeader]] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var partId: js.UndefOr[java.lang.String] = js.undefined
  var parts: js.UndefOr[js.Array[MessagePart]] = js.undefined
}

object MessagePart {
  @scala.inline
  def apply(
    body: MessagePartBody = null,
    filename: java.lang.String = null,
    headers: js.Array[MessagePartHeader] = null,
    mimeType: java.lang.String = null,
    partId: java.lang.String = null,
    parts: js.Array[MessagePart] = null
  ): MessagePart = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (partId != null) __obj.updateDynamic("partId")(partId)
    if (parts != null) __obj.updateDynamic("parts")(parts)
    __obj.asInstanceOf[MessagePart]
  }
}

