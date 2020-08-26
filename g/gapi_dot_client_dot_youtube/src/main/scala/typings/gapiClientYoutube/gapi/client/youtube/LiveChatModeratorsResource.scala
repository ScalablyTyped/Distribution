package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.FieldsKey
import typings.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Adds a new moderator for the chat. */
  def insert(request: Alt): Request[LiveChatModerator] = js.native
  /** Lists moderators for a live chat. */
  def list(request: FieldsKey): Request[LiveChatModeratorListResponse] = js.native
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
  @scala.inline
  implicit class LiveChatModeratorsResourceOps[Self <: LiveChatModeratorsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: QuotaUser => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Alt => Request[LiveChatModerator]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: FieldsKey => Request[LiveChatModeratorListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

