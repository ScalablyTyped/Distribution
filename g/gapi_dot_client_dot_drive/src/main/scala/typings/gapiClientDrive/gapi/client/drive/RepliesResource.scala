package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonAltCommentId
import typings.gapiClientDrive.AnonAltCommentIdFieldsFileId
import typings.gapiClientDrive.AnonAltCommentIdFieldsFileIdIncludeDeleted
import typings.gapiClientDrive.AnonAltCommentIdFieldsFileIdIncludeDeletedKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: AnonAltCommentId): Request_[Reply]
  /** Deletes a reply. */
  def delete(request: AnonAltCommentIdFieldsFileId): Request_[Unit]
  /** Gets a reply by ID. */
  def get(request: AnonAltCommentIdFieldsFileIdIncludeDeleted): Request_[Reply]
  /** Lists a comment's replies. */
  def list(request: AnonAltCommentIdFieldsFileIdIncludeDeletedKey): Request_[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: AnonAltCommentIdFieldsFileId): Request_[Reply]
}

object RepliesResource {
  @scala.inline
  def apply(
    create: AnonAltCommentId => Request_[Reply],
    delete: AnonAltCommentIdFieldsFileId => Request_[Unit],
    get: AnonAltCommentIdFieldsFileIdIncludeDeleted => Request_[Reply],
    list: AnonAltCommentIdFieldsFileIdIncludeDeletedKey => Request_[ReplyList],
    update: AnonAltCommentIdFieldsFileId => Request_[Reply]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RepliesResource]
  }
}

