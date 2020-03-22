package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonCommentId
import typings.gapiClientDrive.AnonFileId
import typings.gapiClientDrive.AnonIncludeDeleted
import typings.gapiClientDrive.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: AnonFileId): Request_[Comment]
  /** Deletes a comment. */
  def delete(request: AnonCommentId): Request_[Unit]
  /** Gets a comment by ID. */
  def get(request: AnonIncludeDeleted): Request_[Comment]
  /** Lists a file's comments. */
  def list(request: AnonKey): Request_[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: AnonCommentId): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    create: AnonFileId => Request_[Comment],
    delete: AnonCommentId => Request_[Unit],
    get: AnonIncludeDeleted => Request_[Comment],
    list: AnonKey => Request_[CommentList],
    update: AnonCommentId => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

