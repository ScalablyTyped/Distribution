package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribersChange extends js.Object {
  /**
    * The clients who subscribed to or unsubscribed from the channel.
    */
  var clients: js.Array[subscribedClient]
  /**
    * The type of the change, either "subscribe" or "unsubscribe".
    */
  var `type`: String
}

object subscribersChange {
  @scala.inline
  def apply(clients: js.Array[subscribedClient], `type`: String): subscribersChange = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribersChange]
  }
}

