package typings.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerGlobalScopeEventMap extends js.Object {
  var notificationclick: NotificationEvent
  var push: PushEvent
  var pushsubscriptionchange: PushSubscriptionChangeEvent
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
}

