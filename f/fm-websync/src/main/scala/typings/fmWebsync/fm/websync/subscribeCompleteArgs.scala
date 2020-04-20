package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeCompleteArgs extends baseResponseArgs {
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean
}

object subscribeCompleteArgs {
  @scala.inline
  def apply(client: client, clientId: String, isResubscribe: Boolean, meta: js.Any, timestamp: Date): subscribeCompleteArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isResubscribe = isResubscribe.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeCompleteArgs]
  }
}

