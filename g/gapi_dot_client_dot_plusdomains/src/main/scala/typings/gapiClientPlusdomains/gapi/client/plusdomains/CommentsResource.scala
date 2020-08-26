package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.ActivityId
import typings.gapiClientPlusdomains.anon.CommentId
import typings.gapiClientPlusdomains.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: CommentId): Request[Comment] = js.native
  /** Create a new comment in reply to an activity. */
  def insert(request: ActivityId): Request[Comment] = js.native
  /** List all of the comments for an activity. */
  def list(request: MaxResults): Request[CommentFeed] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    get: CommentId => Request[Comment],
    insert: ActivityId => Request[Comment],
    list: MaxResults => Request[CommentFeed]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CommentsResource]
  }
  @scala.inline
  implicit class CommentsResourceOps[Self <: CommentsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: CommentId => Request[Comment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ActivityId => Request[Comment]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[CommentFeed]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

