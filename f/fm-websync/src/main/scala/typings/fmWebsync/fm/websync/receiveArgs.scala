package typings.fmWebsync.fm.websync

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
  var publishingClient: typings.fmWebsync.fm.websync.publishingClient
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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], publishingClient = publishingClient.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[receiveArgs]
  }
}

