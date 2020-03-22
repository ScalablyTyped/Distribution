package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAlt
import typings.gapiClientYoutube.AnonFieldsKey
import typings.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a new moderator for the chat. */
  def insert(request: AnonAlt): Request_[LiveChatModerator]
  /** Lists moderators for a live chat. */
  def list(request: AnonFieldsKey): Request_[LiveChatModeratorListResponse]
}

object LiveChatModeratorsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[Unit],
    insert: AnonAlt => Request_[LiveChatModerator],
    list: AnonFieldsKey => Request_[LiveChatModeratorListResponse]
  ): LiveChatModeratorsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LiveChatModeratorsResource]
  }
}

