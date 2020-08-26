package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkEvent extends js.Object {
  /** The number of compressed bytes sent or received. */
  var compressedMessageSize: js.UndefOr[String] = js.native
  /** An identifier for the message, which must be unique in this span. */
  var messageId: js.UndefOr[String] = js.native
  /**
    * For sent messages, this is the time at which the first bit was sent.
    * For received messages, this is the time at which the last bit was
    * received.
    */
  var time: js.UndefOr[String] = js.native
  /**
    * Type of NetworkEvent. Indicates whether the RPC message was sent or
    * received.
    */
  var `type`: js.UndefOr[String] = js.native
  /** The number of uncompressed bytes sent or received. */
  var uncompressedMessageSize: js.UndefOr[String] = js.native
}

object NetworkEvent {
  @scala.inline
  def apply(): NetworkEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEvent]
  }
  @scala.inline
  implicit class NetworkEventOps[Self <: NetworkEvent] (val x: Self) extends AnyVal {
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
    def setCompressedMessageSize(value: String): Self = this.set("compressedMessageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressedMessageSize: Self = this.set("compressedMessageSize", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUncompressedMessageSize(value: String): Self = this.set("uncompressedMessageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncompressedMessageSize: Self = this.set("uncompressedMessageSize", js.undefined)
  }
  
}

