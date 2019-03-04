package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: java.lang.String
}

object baseFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: java.lang.String,
    error: java.lang.String,
    meta: js.Any,
    timestamp: stdLib.Date
  ): baseFailureArgs = {
    val __obj = js.Dynamic.literal(client = client, clientId = clientId, error = error, meta = meta, timestamp = timestamp)
  
    __obj.asInstanceOf[baseFailureArgs]
  }
}

