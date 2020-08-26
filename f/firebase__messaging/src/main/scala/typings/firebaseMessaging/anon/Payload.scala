package typings.firebaseMessaging.anon

import typings.firebaseMessaging.internalMessageMod.MessageType
import typings.firebaseMessaging.messagePayloadMod.MessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload extends js.Object {
  var payload: MessagePayload = js.native
  var `type`: MessageType = js.native
}

object Payload {
  @scala.inline
  def apply(payload: MessagePayload, `type`: MessageType): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
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
    def setPayload(value: MessagePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MessageType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

