package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: gapiDotClientDotPlusLib.Anon_AltCommentId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** List all of the comments for an activity. */
  def list(request: gapiDotClientDotPlusLib.Anon_ActivityIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotPlusLib.Anon_AltCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    list: js.Function1[
      gapiDotClientDotPlusLib.Anon_ActivityIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommentFeed]
    ]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[CommentsResource]
  }
}

