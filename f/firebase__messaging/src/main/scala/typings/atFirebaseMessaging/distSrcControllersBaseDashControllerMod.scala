package typings.atFirebaseMessaging

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.privateMod.FirebaseServiceInternals
import typings.atFirebaseMessaging.distSrcInterfacesMessageDashPayloadMod.MessagePayload
import typings.atFirebaseMessaging.distSrcModelsSubscriptionDashManagerMod.SubscriptionManager
import typings.atFirebaseMessaging.distSrcModelsTokenDashDetailsDashModelMod.TokenDetailsModel
import typings.atFirebaseMessaging.distSrcModelsVapidDashDetailsDashModelMod.VapidDetailsModel
import typings.atFirebaseMessagingDashTypes.atFirebaseMessagingDashTypesMod.FirebaseMessaging
import typings.std.NotificationPermission
import typings.std.PushSubscription
import typings.std.ServiceWorkerRegistration
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/controllers/base-controller", JSImport.Namespace)
@js.native
object distSrcControllersBaseDashControllerMod extends js.Object {
  @js.native
  abstract class BaseController protected () extends FirebaseMessaging {
    def this(app: FirebaseApp) = this()
    var INTERNAL: FirebaseServiceInternals = js.native
    val app: FirebaseApp = js.native
    /**
      * This method will delete the token from the client database, and make a
      * call to FCM to remove it from the server DB. Does not temper with the
      * push subscription.
      */
    var deleteTokenFromDB: js.Any = js.native
    var getNewToken: js.Any = js.native
    /**
      * manageExistingToken is triggered if there's an existing FCM token in the
      * database and it can take 3 different actions:
      * 1) Retrieve the existing FCM token from the database.
      * 2) If VAPID details have changed: Delete the existing token and create a
      * new one with the new VAPID key.
      * 3) If the database cache is invalidated: Send a request to FCM to update
      * the token, and to check if the token is still valid on FCM-side.
      */
    var manageExistingToken: js.Any = js.native
    val subscriptionManager: js.Any = js.native
    val tokenDetailsModel: js.Any = js.native
    var updateToken: js.Any = js.native
    val vapidDetailsModel: js.Any = js.native
    /**
      * This method is required to adhere to the Firebase interface.
      * It closes any currently open indexdb database connections.
      */
    def delete(): js.Promise[Unit] = js.native
    /**
      * Returns the current Notification Permission state.
      */
    def getNotificationPermission_(): NotificationPermission = js.native
    def getPublicVapidKey_(): js.Promise[Uint8Array] = js.native
    /**
      * Gets a PushSubscription for the current user.
      */
    def getPushSubscription(swRegistration: ServiceWorkerRegistration, publicVapidKey: Uint8Array): js.Promise[PushSubscription] = js.native
    def getSWRegistration_(): js.Promise[ServiceWorkerRegistration] = js.native
    def getSubscriptionManager(): SubscriptionManager = js.native
    def getTokenDetailsModel(): TokenDetailsModel = js.native
    def getVapidDetailsModel(): VapidDetailsModel = js.native
  }
  
  val TOKEN_EXPIRATION_MILLIS: Double = js.native
  type BgMessageHandler = js.Function1[/* payload */ MessagePayload, js.Promise[js.Any] | Unit]
}

