package typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdCommentId
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdCommentIdFields
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdEndDate
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdEndDateFetchBodies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: Anon_AltBlogIdCommentId): Request[Comment]
  /** Delete a comment by ID. */
  def delete(request: Anon_AltBlogIdCommentId): Request[Unit]
  /** Gets one comment by ID. */
  def get(request: Anon_AltBlogIdCommentIdFields): Request[Comment]
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: Anon_AltBlogIdEndDate): Request[CommentList]
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: Anon_AltBlogIdEndDateFetchBodies): Request[CommentList]
  /** Marks a comment as spam. */
  def markAsSpam(request: Anon_AltBlogIdCommentId): Request[Comment]
  /** Removes the content of a comment. */
  def removeContent(request: Anon_AltBlogIdCommentId): Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: Anon_AltBlogIdCommentId => Request[Comment],
    delete: Anon_AltBlogIdCommentId => Request[Unit],
    get: Anon_AltBlogIdCommentIdFields => Request[Comment],
    list: Anon_AltBlogIdEndDate => Request[CommentList],
    listByBlog: Anon_AltBlogIdEndDateFetchBodies => Request[CommentList],
    markAsSpam: Anon_AltBlogIdCommentId => Request[Comment],
    removeContent: Anon_AltBlogIdCommentId => Request[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(approve = js.Any.fromFunction1(approve), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByBlog = js.Any.fromFunction1(listByBlog), markAsSpam = js.Any.fromFunction1(markAsSpam), removeContent = js.Any.fromFunction1(removeContent))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

