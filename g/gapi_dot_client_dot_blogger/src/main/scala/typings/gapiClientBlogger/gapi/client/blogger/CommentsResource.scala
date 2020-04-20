package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonCommentId
import typings.gapiClientBlogger.AnonEndDate
import typings.gapiClientBlogger.AnonFetchBodies
import typings.gapiClientBlogger.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: AnonCommentId): Request_[Comment]
  /** Delete a comment by ID. */
  def delete(request: AnonCommentId): Request_[Unit]
  /** Gets one comment by ID. */
  def get(request: AnonKey): Request_[Comment]
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: AnonEndDate): Request_[CommentList]
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: AnonFetchBodies): Request_[CommentList]
  /** Marks a comment as spam. */
  def markAsSpam(request: AnonCommentId): Request_[Comment]
  /** Removes the content of a comment. */
  def removeContent(request: AnonCommentId): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: AnonCommentId => Request_[Comment],
    delete: AnonCommentId => Request_[Unit],
    get: AnonKey => Request_[Comment],
    list: AnonEndDate => Request_[CommentList],
    listByBlog: AnonFetchBodies => Request_[CommentList],
    markAsSpam: AnonCommentId => Request_[Comment],
    removeContent: AnonCommentId => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(approve = js.Any.fromFunction1(approve), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByBlog = js.Any.fromFunction1(listByBlog), markAsSpam = js.Any.fromFunction1(markAsSpam), removeContent = js.Any.fromFunction1(removeContent))
    __obj.asInstanceOf[CommentsResource]
  }
}

