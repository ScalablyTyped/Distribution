package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.CommentId
import typings.gapiClientBlogger.anon.EndDate
import typings.gapiClientBlogger.anon.FetchBodies
import typings.gapiClientBlogger.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: CommentId): Request[Comment]
  /** Delete a comment by ID. */
  def delete(request: CommentId): Request[Unit]
  /** Gets one comment by ID. */
  def get(request: Key): Request[Comment]
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: EndDate): Request[CommentList]
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: FetchBodies): Request[CommentList]
  /** Marks a comment as spam. */
  def markAsSpam(request: CommentId): Request[Comment]
  /** Removes the content of a comment. */
  def removeContent(request: CommentId): Request[Comment]
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
}

