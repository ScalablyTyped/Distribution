package typings.firebaseMessaging.internalMessageMod

import typings.firebaseMessaging.anon.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalMessage extends js.Object {
  var firebaseMessaging: Payload = js.native
}

object InternalMessage {
  @scala.inline
  def apply(firebaseMessaging: Payload): InternalMessage = {
    val __obj = js.Dynamic.literal(firebaseMessaging = firebaseMessaging.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalMessage]
  }
  @scala.inline
  implicit class InternalMessageOps[Self <: InternalMessage] (val x: Self) extends AnyVal {
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
    def setFirebaseMessaging(value: Payload): Self = this.set("firebaseMessaging", value.asInstanceOf[js.Any])
  }
  
}

