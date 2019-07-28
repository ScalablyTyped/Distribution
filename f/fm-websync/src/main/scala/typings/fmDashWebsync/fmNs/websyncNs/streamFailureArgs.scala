package typings.fmDashWebsync.fmNs.websyncNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait streamFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: String
  /**
    * Whether the client will automatically reconnect after the callback returns.
    */
  var willReconnect: Boolean
}

object streamFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    meta: js.Any,
    timestamp: Date,
    willReconnect: Boolean
  ): streamFailureArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, error = error, meta = meta, timestamp = timestamp, willReconnect = willReconnect)
  
    __obj.asInstanceOf[streamFailureArgs]
  }
}

