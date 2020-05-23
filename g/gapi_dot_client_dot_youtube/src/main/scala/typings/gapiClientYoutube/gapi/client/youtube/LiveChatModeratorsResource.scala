package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.FieldsKey
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: QuotaUser): Request[Unit]
  /** Adds a new moderator for the chat. */
  def insert(request: Alt): Request[LiveChatModerator]
  /** Lists moderators for a live chat. */
  def list(request: FieldsKey): Request[LiveChatModeratorListResponse]
}

object LiveChatModeratorsResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[LiveChatModerator],
    list: FieldsKey => Request[LiveChatModeratorListResponse]
  ): LiveChatModeratorsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LiveChatModeratorsResource]
  }
}

