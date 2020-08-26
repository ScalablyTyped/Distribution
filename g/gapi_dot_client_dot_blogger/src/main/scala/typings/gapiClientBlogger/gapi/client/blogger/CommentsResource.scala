package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.CommentId
import typings.gapiClientBlogger.anon.EndDate
import typings.gapiClientBlogger.anon.FetchBodies
import typings.gapiClientBlogger.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: CommentId): Request[Comment] = js.native
  /** Delete a comment by ID. */
  def delete(request: CommentId): Request[Unit] = js.native
  /** Gets one comment by ID. */
  def get(request: Key): Request[Comment] = js.native
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: EndDate): Request[CommentList] = js.native
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: FetchBodies): Request[CommentList] = js.native
  /** Marks a comment as spam. */
  def markAsSpam(request: CommentId): Request[Comment] = js.native
  /** Removes the content of a comment. */
  def removeContent(request: CommentId): Request[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: CommentId => Request[Comment],
    delete: CommentId => Request[Unit],
    get: Key => Request[Comment],
    list: EndDate => Request[CommentList],
    listByBlog: FetchBodies => Request[CommentList],
    markAsSpam: CommentId => Request[Comment],
    removeContent: CommentId => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(approve = js.Any.fromFunction1(approve), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByBlog = js.Any.fromFunction1(listByBlog), markAsSpam = js.Any.fromFunction1(markAsSpam), removeContent = js.Any.fromFunction1(removeContent))
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
    def setApprove(value: CommentId => Request[Comment]): Self = this.set("approve", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: CommentId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Comment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EndDate => Request[CommentList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListByBlog(value: FetchBodies => Request[CommentList]): Self = this.set("listByBlog", js.Any.fromFunction1(value))
    @scala.inline
    def setMarkAsSpam(value: CommentId => Request[Comment]): Self = this.set("markAsSpam", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveContent(value: CommentId => Request[Comment]): Self = this.set("removeContent", js.Any.fromFunction1(value))
  }
  
}

