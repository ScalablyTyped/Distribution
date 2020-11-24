package typings.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerGlobalScopeEventMap extends js.Object {
  
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
  implicit class ServiceWorkerGlobalScopeEventMapOps[Self <: ServiceWorkerGlobalScopeEventMap] (val x: Self) extends AnyVal {
    
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
    def setNotificationclick(value: NotificationEvent): Self = this.set("notificationclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: PushEvent): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushsubscriptionchange(value: PushSubscriptionChangeEvent): Self = this.set("pushsubscriptionchange", value.asInstanceOf[js.Any])
  }
}
