package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAltCommentId
import typings.gapiClientDrive.AnonAltCommentIdFields
import typings.gapiClientDrive.AnonAltFieldsFileId
import typings.gapiClientDrive.AnonAltFieldsFileIdIncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: AnonAltFieldsFileId): Request_[Comment]
  /** Deletes a comment. */
  def delete(request: AnonAltCommentId): Request_[Unit]
  /** Gets a comment by ID. */
  def get(request: AnonAltCommentIdFields): Request_[Comment]
  /** Lists a file's comments. */
  def list(request: AnonAltFieldsFileIdIncludeDeleted): Request_[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: AnonAltCommentId): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    create: AnonAltFieldsFileId => Request_[Comment],
    delete: AnonAltCommentId => Request_[Unit],
    get: AnonAltCommentIdFields => Request_[Comment],
    list: AnonAltFieldsFileIdIncludeDeleted => Request_[CommentList],
    update: AnonAltCommentId => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CommentsResource]
  }
}

