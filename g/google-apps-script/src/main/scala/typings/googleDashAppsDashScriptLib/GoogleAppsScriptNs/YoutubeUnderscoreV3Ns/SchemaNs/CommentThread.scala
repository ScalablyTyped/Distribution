package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThread extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var replies: js.UndefOr[CommentThreadReplies] = js.undefined
  var snippet: js.UndefOr[CommentThreadSnippet] = js.undefined
}

object CommentThread {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    replies: CommentThreadReplies = null,
    snippet: CommentThreadSnippet = null
  ): CommentThread = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[CommentThread]
  }
}

