package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDrive.AnonCommentId
import typings.gapiClientDrive.AnonPageToken
import typings.gapiClientDrive.AnonReplyId
import typings.gapiClientDrive.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: AnonCommentId): Request_[Reply]
  /** Deletes a reply. */
  def delete(request: AnonReplyId): Request_[Unit]
  /** Gets a reply by ID. */
  def get(request: AnonUserIp): Request_[Reply]
  /** Lists a comment's replies. */
  def list(request: AnonPageToken): Request_[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: AnonReplyId): Request_[Reply]
}

object RepliesResource {
  @scala.inline
  def apply(
    create: AnonCommentId => Request_[Reply],
    delete: AnonReplyId => Request_[Unit],
    get: AnonUserIp => Request_[Reply],
    list: AnonPageToken => Request_[ReplyList],
    update: AnonReplyId => Request_[Reply]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RepliesResource]
  }
}

