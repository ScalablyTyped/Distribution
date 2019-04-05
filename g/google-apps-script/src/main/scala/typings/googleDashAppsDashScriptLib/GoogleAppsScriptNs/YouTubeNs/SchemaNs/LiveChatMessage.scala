package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessage extends js.Object {
  var authorDetails: js.UndefOr[LiveChatMessageAuthorDetails] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[LiveChatMessageSnippet] = js.undefined
}

object LiveChatMessage {
  @scala.inline
  def apply(
    authorDetails: LiveChatMessageAuthorDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: LiveChatMessageSnippet = null
  ): LiveChatMessage = {
    val __obj = js.Dynamic.literal()
    if (authorDetails != null) __obj.updateDynamic("authorDetails")(authorDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[LiveChatMessage]
  }
}

