package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperChatEventsResource extends js.Object {
  /** Lists Super Chat events for a channel. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHl): gapiDotClientLib.gapiNs.clientNs.Request[SuperChatEventListResponse]
}

object SuperChatEventsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsHl => gapiDotClientLib.gapiNs.clientNs.Request[SuperChatEventListResponse]
  ): SuperChatEventsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SuperChatEventsResource]
  }
}

