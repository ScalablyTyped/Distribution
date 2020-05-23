package typings.firebaseMessaging.internalMessageMod

import typings.firebaseMessaging.anon.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalMessage extends js.Object {
  var firebaseMessaging: Payload
}

object InternalMessage {
  @scala.inline
  def apply(firebaseMessaging: Payload): InternalMessage = {
    val __obj = js.Dynamic.literal(firebaseMessaging = firebaseMessaging.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalMessage]
  }
}

