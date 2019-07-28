package typings.fmDashWebsync.fmNs.websyncNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait receiveArgs extends baseResponseArgs {
  /**
    * The channel over which the data was published.
    */
  var channel: String
  /**
    * The published data.
    */
  var data: js.Any
  /**
    * Details about the client publishing the data.
    */
  var publishingClient: typings.fmDashWebsync.fmNs.websyncNs.publishingClient
}

object receiveArgs {
  @scala.inline
  def apply(
    channel: String,
    client: client,
    clientId: String,
    data: js.Any,
    meta: js.Any,
    publishingClient: publishingClient,
    timestamp: Date
  ): receiveArgs = {
    val __obj = js.Dynamic.literal(channel = channel, client = client, clientId = clientId, data = data, meta = meta, publishingClient = publishingClient, timestamp = timestamp)
  
    __obj.asInstanceOf[receiveArgs]
  }
}

