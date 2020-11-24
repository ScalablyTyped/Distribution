package typings.firebaseMessagingTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerRegistration extends js.Object {
  
  var serviceWorkerRegistration: js.UndefOr[typings.std.ServiceWorkerRegistration] = js.native
  
  var vapidKey: js.UndefOr[String] = js.native
}
object ServiceWorkerRegistration {
  
  @scala.inline
  def apply(): ServiceWorkerRegistration = {
    val __obj = js.Dynamic.literal()
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
    def setServiceWorkerRegistration(value: typings.std.ServiceWorkerRegistration): Self = this.set("serviceWorkerRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceWorkerRegistration: Self = this.set("serviceWorkerRegistration", js.undefined)
    
    @scala.inline
    def setVapidKey(value: String): Self = this.set("vapidKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVapidKey: Self = this.set("vapidKey", js.undefined)
  }
}
