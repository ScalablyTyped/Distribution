package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerRegistration extends js.Object {
  var isDeleted: Boolean = js.native
  var registrationId: RegistrationID = js.native
  var scopeURL: String = js.native
}

object ServiceWorkerRegistration {
  @scala.inline
  def apply(isDeleted: Boolean, registrationId: RegistrationID, scopeURL: String): ServiceWorkerRegistration = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistration]
  }
  @scala.inline
  implicit class ServiceWorkerRegistrationOps[Self <: ServiceWorkerRegistration] (val x: Self) extends AnyVal {
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
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeURL(value: String): Self = this.set("scopeURL", value.asInstanceOf[js.Any])
  }
  
}

