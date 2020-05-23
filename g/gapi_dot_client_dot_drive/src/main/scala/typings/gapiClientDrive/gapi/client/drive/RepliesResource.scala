package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.CommentId
import typings.gapiClientDrive.anon.PageToken
import typings.gapiClientDrive.anon.ReplyId
import typings.gapiClientDrive.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: CommentId): Request[Reply]
  /** Deletes a reply. */
  def delete(request: ReplyId): Request[Unit]
  /** Gets a reply by ID. */
  def get(request: UserIp): Request[Reply]
  /** Lists a comment's replies. */
  def list(request: PageToken): Request[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: ReplyId): Request[Reply]
}

object RepliesResource {
  @scala.inline
  def apply(
    create: CommentId => Request[Reply],
    delete: ReplyId => Request[Unit],
    get: UserIp => Request[Reply],
    list: PageToken => Request[ReplyList],
    update: ReplyId => Request[Reply]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RepliesResource]
  }
}

