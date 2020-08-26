package typings.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishRequest extends js.Object {
  /** The messages to publish. */
  var messages: js.UndefOr[js.Array[PubsubMessage]] = js.native
}

object PublishRequest {
  @scala.inline
  def apply(): PublishRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishRequest]
  }
  @scala.inline
  implicit class PublishRequestOps[Self <: PublishRequest] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: PubsubMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[PubsubMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
  
}

