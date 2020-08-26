package typings.gapiClientPubsub.gapi.client.pubsub

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubsubMessage extends js.Object {
  /** Optional attributes for this message. */
  var attributes: js.UndefOr[Record[String, String]] = js.native
  /** The message payload. */
  var data: js.UndefOr[String] = js.native
  /**
    * ID of this message, assigned by the server when the message is published.
    * Guaranteed to be unique within the topic. This value may be read by a
    * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
    * delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The time at which the message was published, populated by the server when
    * it receives the `Publish` call. It must not be populated by the
    * publisher in a `Publish` call.
    */
  var publishTime: js.UndefOr[String] = js.native
}

object PubsubMessage {
  @scala.inline
  def apply(): PubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubMessage]
  }
  @scala.inline
  implicit class PubsubMessageOps[Self <: PubsubMessage] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Record[String, String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setPublishTime(value: String): Self = this.set("publishTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishTime: Self = this.set("publishTime", js.undefined)
  }
  
}

