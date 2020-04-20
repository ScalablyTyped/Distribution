package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait unsubscribeSuccessArgs extends baseResponseArgs {
  /**
    * The channel from which the client was unsubscribed. Must start with a forward slash (/).
    */
  var channel: String
  /**
    * The channels from which the client was unsubscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[String]
}

object unsubscribeSuccessArgs {
  @scala.inline
  def apply(
    channel: String,
    channels: js.Array[String],
    client: client,
    clientId: String,
    meta: js.Any,
    timestamp: Date
  ): unsubscribeSuccessArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[unsubscribeSuccessArgs]
  }
}

