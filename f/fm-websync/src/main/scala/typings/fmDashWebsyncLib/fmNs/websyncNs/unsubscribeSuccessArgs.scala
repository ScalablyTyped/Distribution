package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait unsubscribeSuccessArgs extends baseResponseArgs {
  /**
    * The channel from which the client was unsubscribed. Must start with a forward slash (/).
    */
  var channel: java.lang.String
  /**
    * The channels from which the client was unsubscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[java.lang.String]
}

object unsubscribeSuccessArgs {
  @scala.inline
  def apply(
    channel: java.lang.String,
    channels: js.Array[java.lang.String],
    client: client,
    clientId: java.lang.String,
    meta: js.Any,
    timestamp: stdLib.Date
  ): unsubscribeSuccessArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[unsubscribeSuccessArgs]
  }
}

