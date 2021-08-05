package typings.firebaseMessaging

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import typings.firebaseMessagingTypes.mod.MessagePayload
import typings.firebaseUtil.subscribeMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swControllerMod {
  
  @JSImport("@firebase/messaging/dist/controllers/sw-controller", "SwController")
  @js.native
  class SwController protected ()
    extends StObject
       with FirebaseMessaging
       with FirebaseService {
    def this(firebaseDependencies: FirebaseInternalDependencies) = this()
    
    /* CompleteClass */
    var app: FirebaseApp = js.native
    @JSName("app")
    def app_MSwController: typings.firebaseMessaging.mod.FirebaseApp = js.native
    
    /* private */ var bgMessageHandler: js.Any = js.native
    
    /* private */ val firebaseDependencies: js.Any = js.native
    
    /* private */ var isOnBackgroundMessageUsed: js.Any = js.native
    
    def onMessage(): Unsubscribe = js.native
    
    def onNotificationClick(event: NotificationEvent): js.Promise[Unit] = js.native
    
    /**
      * A handler for push events that shows notifications based on the content of the payload.
      *
      * The payload must be a JSON-encoded Object with a `notification` key. The value of the
      * `notification` property will be used as the NotificationOptions object passed to
      * showNotification. Additionally, the `title` property of the notification object will be used as
      * the title.
      *
      * If there is no notification data in the payload then no notification will be shown.
      */
    def onPush(event: PushEvent): js.Promise[Unit] = js.native
    
    def onSubChange(event: PushSubscriptionChangeEvent): js.Promise[Unit] = js.native
    
    def onTokenRefresh(): Unsubscribe = js.native
    
    def useServiceWorker(): Unit = js.native
    
    /* private */ var vapidKey: js.Any = js.native
  }
  
  type BgMessageHandler = js.Function1[/* payload */ MessagePayload, js.Any]
}
