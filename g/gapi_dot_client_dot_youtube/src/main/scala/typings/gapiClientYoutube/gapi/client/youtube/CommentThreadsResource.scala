package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AllThreadsRelatedToChannelId
import typings.gapiClientYoutube.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: Alt): Request[CommentThread] = js.native
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: AllThreadsRelatedToChannelId): Request[CommentThreadListResponse] = js.native
  /** Modifies the top-level comment in a comment thread. */
  def update(request: Alt): Request[CommentThread] = js.native
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: Alt => Request[CommentThread],
    list: AllThreadsRelatedToChannelId => Request[CommentThreadListResponse],
    update: Alt => Request[CommentThread]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentThreadsResource]
  }
  @scala.inline
  implicit class CommentThreadsResourceOps[Self <: CommentThreadsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsert(value: Alt => Request[CommentThread]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AllThreadsRelatedToChannelId => Request[CommentThreadListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[CommentThread]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

