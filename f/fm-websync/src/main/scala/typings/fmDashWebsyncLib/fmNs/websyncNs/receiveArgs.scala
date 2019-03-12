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
  var publishingClient: fmDashWebsyncLib.fmNs.websyncNs.publishingClient
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
    val __obj = js.Dynamic.literal(channel = channel, client = client, clientId = clientId, data = data, meta = meta, publishingClient = publishingClient, timestamp = timestamp)
  
    __obj.asInstanceOf[receiveArgs]
  }
}

