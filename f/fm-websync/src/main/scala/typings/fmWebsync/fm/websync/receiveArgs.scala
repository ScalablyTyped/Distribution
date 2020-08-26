package typings.fmWebsync.fm.websync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait receiveArgs extends baseResponseArgs {
  /**
    * The channel over which the data was published.
    */
  var channel: String = js.native
  /**
    * The published data.
    */
  var data: js.Any = js.native
  /**
    * Details about the client publishing the data.
    */
  var publishingClient: typings.fmWebsync.fm.websync.publishingClient = js.native
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
  @scala.inline
  implicit class receiveArgsOps[Self <: receiveArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishingClient(value: publishingClient): Self = this.set("publishingClient", value.asInstanceOf[js.Any])
  }
  
}

