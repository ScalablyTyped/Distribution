package typings.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistration extends StObject {
  
  var serviceWorkerRegistration: js.UndefOr[typings.std.ServiceWorkerRegistration] = js.undefined
  
  var vapidKey: js.UndefOr[String] = js.undefined
}
object ServiceWorkerRegistration {
  
  @scala.inline
  def apply(): ServiceWorkerRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceWorkerRegistration]
  }
  
  @scala.inline
  implicit class ServiceWorkerRegistrationMutableBuilder[Self <: ServiceWorkerRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceWorkerRegistration(value: typings.std.ServiceWorkerRegistration): Self = StObject.set(x, "serviceWorkerRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerRegistrationUndefined: Self = StObject.set(x, "serviceWorkerRegistration", js.undefined)
    
    @scala.inline
    def setVapidKey(value: String): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVapidKeyUndefined: Self = StObject.set(x, "vapidKey", js.undefined)
  }
}
