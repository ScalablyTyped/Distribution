package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribeFailureArgs extends baseFailureArgs {
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: scala.Boolean
}

object subscribeFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: java.lang.String,
    error: java.lang.String,
    isResubscribe: scala.Boolean,
    meta: js.Any,
    timestamp: stdLib.Date
  ): subscribeFailureArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("isResubscribe")(isResubscribe)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[subscribeFailureArgs]
  }
}

