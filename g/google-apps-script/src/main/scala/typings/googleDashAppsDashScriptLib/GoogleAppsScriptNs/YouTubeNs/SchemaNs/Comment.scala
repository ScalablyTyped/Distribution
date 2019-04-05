package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[CommentSnippet] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: CommentSnippet = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[Comment]
  }
}

