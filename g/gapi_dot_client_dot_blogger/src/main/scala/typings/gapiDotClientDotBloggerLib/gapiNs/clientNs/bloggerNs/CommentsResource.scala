package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Delete a comment by ID. */
  def delete(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one comment by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDate): gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodies): gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
  /** Marks a comment as spam. */
  def markAsSpam(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Removes the content of a comment. */
  def removeContent(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    delete: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    list: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDate, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
    ],
    listByBlog: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodies, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommentList]
    ],
    markAsSpam: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ],
    removeContent: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdCommentId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Comment]
    ]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(approve = approve, delete = delete, get = get, list = list, listByBlog = listByBlog, markAsSpam = markAsSpam, removeContent = removeContent)
  
    __obj.asInstanceOf[CommentsResource]
  }
}

