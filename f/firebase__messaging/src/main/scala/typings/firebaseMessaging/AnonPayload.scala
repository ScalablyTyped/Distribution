package typings.firebaseMessaging

import typings.firebaseMessaging.internalMessageMod.MessageType
import typings.firebaseMessaging.messagePayloadMod.MessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: MessagePayload
  var `type`: MessageType
}

object AnonPayload {
  @scala.inline
  def apply(payload: MessagePayload, `type`: MessageType): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

