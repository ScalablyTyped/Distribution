package typings.firebaseMessagingTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var messaging: FirebaseMessaging = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(messaging: FirebaseMessaging): NameServiceMapping = {
    val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
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
    def setMessaging(value: FirebaseMessaging): Self = this.set("messaging", value.asInstanceOf[js.Any])
  }
  
}

