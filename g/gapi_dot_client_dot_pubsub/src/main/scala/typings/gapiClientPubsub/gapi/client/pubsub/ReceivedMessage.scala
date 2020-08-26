package typings.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceivedMessage extends js.Object {
  /** This ID can be used to acknowledge the received message. */
  var ackId: js.UndefOr[String] = js.native
  /** The message. */
  var message: js.UndefOr[PubsubMessage] = js.native
}

object ReceivedMessage {
  @scala.inline
  def apply(): ReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceivedMessage]
  }
  @scala.inline
  implicit class ReceivedMessageOps[Self <: ReceivedMessage] (val x: Self) extends AnyVal {
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
    def setAckId(value: String): Self = this.set("ackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckId: Self = this.set("ackId", js.undefined)
    @scala.inline
    def setMessage(value: PubsubMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

