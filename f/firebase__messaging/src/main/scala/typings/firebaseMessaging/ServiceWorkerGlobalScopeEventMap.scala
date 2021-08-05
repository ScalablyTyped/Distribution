package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerGlobalScopeEventMap extends StObject {
  
  var notificationclick: NotificationEvent
  
  var push: PushEvent
  
  var pushsubscriptionchange: PushSubscriptionChangeEvent
}
object ServiceWorkerGlobalScopeEventMap {
  
  inline def apply(
    notificationclick: NotificationEvent,
    push: PushEvent,
    pushsubscriptionchange: PushSubscriptionChangeEvent
  ): ServiceWorkerGlobalScopeEventMap = {
    val __obj = js.Dynamic.literal(notificationclick = notificationclick.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], pushsubscriptionchange = pushsubscriptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerGlobalScopeEventMap]
  }
  
  extension [Self <: ServiceWorkerGlobalScopeEventMap](x: Self) {
    
    inline def setNotificationclick(value: NotificationEvent): Self = StObject.set(x, "notificationclick", value.asInstanceOf[js.Any])
    
    inline def setPush(value: PushEvent): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushsubscriptionchange(value: PushSubscriptionChangeEvent): Self = StObject.set(x, "pushsubscriptionchange", value.asInstanceOf[js.Any])
  }
}
