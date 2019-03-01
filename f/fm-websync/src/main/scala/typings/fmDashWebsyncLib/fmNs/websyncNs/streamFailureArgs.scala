package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait streamFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: java.lang.String
  /**
    * Whether the client will automatically reconnect after the callback returns.
    */
  var willReconnect: scala.Boolean
}

object streamFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: java.lang.String,
    error: java.lang.String,
    meta: js.Any,
    timestamp: stdLib.Date,
    willReconnect: scala.Boolean
  ): streamFailureArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("willReconnect")(willReconnect)
    __obj.asInstanceOf[streamFailureArgs]
  }
}

