package typings.fmDashWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeFailureArgs extends baseFailureArgs {
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean
}

object subscribeFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    isResubscribe: Boolean,
    meta: js.Any,
    timestamp: Date
  ): subscribeFailureArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, error = error, isResubscribe = isResubscribe, meta = meta, timestamp = timestamp)
  
    __obj.asInstanceOf[subscribeFailureArgs]
  }
}

