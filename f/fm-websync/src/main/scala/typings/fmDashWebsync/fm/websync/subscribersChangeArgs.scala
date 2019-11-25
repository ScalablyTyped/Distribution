package typings.fmDashWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribersChangeArgs extends baseResponseArgs {
  /**
    * The details of the change that occurred.
    */
  var change: js.UndefOr[subscribersChange] = js.undefined
  /**
    * The channel on which the change occurred.
    */
  var channel: js.UndefOr[String] = js.undefined
}

object subscribersChangeArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    meta: js.Any,
    timestamp: Date,
    change: subscribersChange = null,
    channel: String = null
  ): subscribersChangeArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribersChangeArgs]
  }
}

