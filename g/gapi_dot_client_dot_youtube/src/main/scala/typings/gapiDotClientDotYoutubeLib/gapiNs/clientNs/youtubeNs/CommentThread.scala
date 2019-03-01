package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThread extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the comment thread. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#commentThread". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The replies object contains a limited number of replies (if any) to the top level comment found in the snippet. */
  var replies: js.UndefOr[CommentThreadReplies] = js.undefined
  /** The snippet object contains basic details about the comment thread and also the top level comment. */
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

