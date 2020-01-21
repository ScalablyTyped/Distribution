package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonAltBlogIdCommentId
import typings.gapiClientBlogger.AnonAltBlogIdCommentIdFields
import typings.gapiClientBlogger.AnonAltBlogIdEndDate
import typings.gapiClientBlogger.AnonAltBlogIdEndDateFetchBodies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: AnonAltBlogIdCommentId): Request_[Comment]
  /** Delete a comment by ID. */
  def delete(request: AnonAltBlogIdCommentId): Request_[Unit]
  /** Gets one comment by ID. */
  def get(request: AnonAltBlogIdCommentIdFields): Request_[Comment]
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: AnonAltBlogIdEndDate): Request_[CommentList]
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: AnonAltBlogIdEndDateFetchBodies): Request_[CommentList]
  /** Marks a comment as spam. */
  def markAsSpam(request: AnonAltBlogIdCommentId): Request_[Comment]
  /** Removes the content of a comment. */
  def removeContent(request: AnonAltBlogIdCommentId): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: AnonAltBlogIdCommentId => Request_[Comment],
    delete: AnonAltBlogIdCommentId => Request_[Unit],
    get: AnonAltBlogIdCommentIdFields => Request_[Comment],
    list: AnonAltBlogIdEndDate => Request_[CommentList],
    listByBlog: AnonAltBlogIdEndDateFetchBodies => Request_[CommentList],
    markAsSpam: AnonAltBlogIdCommentId => Request_[Comment],
    removeContent: AnonAltBlogIdCommentId => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(approve = js.Any.fromFunction1(approve), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByBlog = js.Any.fromFunction1(listByBlog), markAsSpam = js.Any.fromFunction1(markAsSpam), removeContent = js.Any.fromFunction1(removeContent))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

