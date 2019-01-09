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

