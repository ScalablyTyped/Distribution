package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerGlobalScopeEventMap extends StObject {
  
  var notificationclick: NotificationEvent = js.native
  
  var push: PushEvent = js.native
  
  var pushsubscriptionchange: PushSubscriptionChangeEvent = js.native
}
object ServiceWorkerGlobalScopeEventMap {
  
  @scala.inline
  def apply(
    notificationclick: NotificationEvent,
    push: PushEvent,
    pushsubscriptionchange: PushSubscriptionChangeEvent
  ): ServiceWorkerGlobalScopeEventMap = {
    val __obj = js.Dynamic.literal(notificationclick = notificationclick.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], pushsubscriptionchange = pushsubscriptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerGlobalScopeEventMap]
  }
  
  @scala.inline
  implicit class ServiceWorkerGlobalScopeEventMapMutableBuilder[Self <: ServiceWorkerGlobalScopeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationclick(value: NotificationEvent): Self = StObject.set(x, "notificationclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: PushEvent): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushsubscriptionchange(value: PushSubscriptionChangeEvent): Self = StObject.set(x, "pushsubscriptionchange", value.asInstanceOf[js.Any])
  }
}
