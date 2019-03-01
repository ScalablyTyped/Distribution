package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait receiveArgs extends baseResponseArgs {
  /**
    * The channel over which the data was published.
    */
  var channel: java.lang.String
  /**
    * The published data.
    */
  var data: js.Any
  /**
    * Details about the client publishing the data.
    */
  var publishingClient: publishingClient
}

object receiveArgs {
  @scala.inline
  def apply(
    channel: java.lang.String,
    client: client,
    clientId: java.lang.String,
    data: js.Any,
    meta: js.Any,
    publishingClient: publishingClient,
    timestamp: stdLib.Date
  ): receiveArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("publishingClient")(publishingClient)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[receiveArgs]
  }
}

