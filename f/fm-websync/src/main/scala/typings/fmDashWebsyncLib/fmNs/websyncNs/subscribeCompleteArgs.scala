package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeCompleteArgs extends baseResponseArgs {
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: scala.Boolean
}

object subscribeCompleteArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: java.lang.String,
    isResubscribe: scala.Boolean,
    meta: js.Any,
    timestamp: stdLib.Date
  ): subscribeCompleteArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, isResubscribe = isResubscribe, meta = meta, timestamp = timestamp)
  
    __obj.asInstanceOf[subscribeCompleteArgs]
  }
}

