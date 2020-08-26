package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchSyncEventRequest extends js.Object {
  var lastChance: Boolean = js.native
  var origin: String = js.native
  var registrationId: RegistrationID = js.native
  var tag: String = js.native
}

object DispatchSyncEventRequest {
  @scala.inline
  def apply(lastChance: Boolean, origin: String, registrationId: RegistrationID, tag: String): DispatchSyncEventRequest = {
    val __obj = js.Dynamic.literal(lastChance = lastChance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchSyncEventRequest]
  }
  @scala.inline
  implicit class DispatchSyncEventRequestOps[Self <: DispatchSyncEventRequest] (val x: Self) extends AnyVal {
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
    def setLastChance(value: Boolean): Self = this.set("lastChance", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

