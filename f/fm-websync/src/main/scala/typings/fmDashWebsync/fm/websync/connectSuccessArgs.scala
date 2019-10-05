package typings.fmDashWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait connectSuccessArgs extends baseResponseArgs {
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean
}

object connectSuccessArgs {
  @scala.inline
  def apply(client: client, clientId: String, isReconnect: Boolean, meta: js.Any, timestamp: Date): connectSuccessArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, isReconnect = isReconnect, meta = meta, timestamp = timestamp)
  
    __obj.asInstanceOf[connectSuccessArgs]
  }
}

