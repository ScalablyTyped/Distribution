package typings.firebaseMessaging

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.messagePayloadMod.MessagePayload
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import typings.firebaseUtil.subscribeMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/controllers/sw-controller", JSImport.Namespace)
@js.native
object swControllerMod extends js.Object {
  @js.native
  class SwController protected ()
    extends FirebaseMessaging
       with FirebaseService {
    def this(firebaseDependencies: FirebaseInternalDependencies) = this()
    /* CompleteClass */
    override var app: FirebaseApp = js.native
    var bgMessageHandler: js.Any = js.native
    val firebaseDependencies: js.Any = js.native
    var vapidKey: js.Any = js.native
    @JSName("app")
    def app_MSwController: typings.firebaseMessaging.mod.FirebaseApp = js.native
    def deleteToken(): js.Promise[Boolean] = js.native
    def onMessage(): Unsubscribe = js.native
    def onNotificationClick(event: NotificationEvent): js.Promise[Unit] = js.native
    /**
      * A handler for push events that shows notifications based on the content of
      * the payload.
      *
      * The payload must be a JSON-encoded Object with a `notification` key. The
      * value of the `notification` property will be used as the NotificationOptions
      * object passed to showNotification. Additionally, the `title` property of the
      * notification object will be used as the title.
      *
      * If there is no notification data in the payload then no notification will be
      * shown.
      */
    def onPush(event: PushEvent): js.Promise[Unit] = js.native
    def onSubChange(event: PushSubscriptionChangeEvent): js.Promise[Unit] = js.native
    def onTokenRefresh(): Unsubscribe = js.native
    def useServiceWorker(): Unit = js.native
  }
  
  type BgMessageHandler = js.Function1[/* payload */ MessagePayload, js.Any]
}

