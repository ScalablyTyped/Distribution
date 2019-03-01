package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscribersChangeArgs extends baseResponseArgs {
  /**
    * The details of the change that occurred.
    */
  var change: js.UndefOr[subscribersChange] = js.undefined
  /**
    * The channel on which the change occurred.
    */
  var channel: js.UndefOr[java.lang.String] = js.undefined
}

object subscribersChangeArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: java.lang.String,
    meta: js.Any,
    timestamp: stdLib.Date,
    change: subscribersChange = null,
    channel: java.lang.String = null
  ): subscribersChangeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("timestamp")(timestamp)
    if (change != null) __obj.updateDynamic("change")(change)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[subscribersChangeArgs]
  }
}

