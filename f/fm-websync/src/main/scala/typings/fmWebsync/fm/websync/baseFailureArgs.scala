package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: String
}

object baseFailureArgs {
  @scala.inline
  def apply(client: client, clientId: String, error: String, meta: js.Any, timestamp: Date): baseFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseFailureArgs]
  }
}

