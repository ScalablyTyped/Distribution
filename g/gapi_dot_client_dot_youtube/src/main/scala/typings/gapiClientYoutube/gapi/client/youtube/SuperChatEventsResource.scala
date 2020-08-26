package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperChatEventsResource extends js.Object {
  /** Lists Super Chat events for a channel. */
  def list(request: PageToken): Request[SuperChatEventListResponse] = js.native
}

object SuperChatEventsResource {
  @scala.inline
  def apply(list: PageToken => Request[SuperChatEventListResponse]): SuperChatEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SuperChatEventsResource]
  }
  @scala.inline
  implicit class SuperChatEventsResourceOps[Self <: SuperChatEventsResource] (val x: Self) extends AnyVal {
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
    def setList(value: PageToken => Request[SuperChatEventListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

