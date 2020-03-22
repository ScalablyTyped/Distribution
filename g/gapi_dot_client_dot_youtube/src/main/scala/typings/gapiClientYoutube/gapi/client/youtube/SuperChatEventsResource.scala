package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperChatEventsResource extends js.Object {
  /** Lists Super Chat events for a channel. */
  def list(request: AnonPageToken): Request_[SuperChatEventListResponse]
}

object SuperChatEventsResource {
  @scala.inline
  def apply(list: AnonPageToken => Request_[SuperChatEventListResponse]): SuperChatEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SuperChatEventsResource]
  }
}

