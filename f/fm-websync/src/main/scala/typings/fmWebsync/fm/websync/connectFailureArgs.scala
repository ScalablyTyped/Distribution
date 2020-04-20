package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait connectFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: String
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean
  /**
    * Whether or not to reconnect automatically after this callback has finished execution.
    */
  var reconnect: Boolean
}

object connectFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    isReconnect: Boolean,
    meta: js.Any,
    reconnect: Boolean,
    timestamp: Date
  ): connectFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectFailureArgs]
  }
}

