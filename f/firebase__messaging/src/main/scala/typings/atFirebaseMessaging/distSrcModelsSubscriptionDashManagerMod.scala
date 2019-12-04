package typings.atFirebaseMessaging

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseMessaging.distSrcInterfacesTokenDashDetailsMod.TokenDetails
import typings.std.PushSubscription
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/subscription-manager", JSImport.Namespace)
@js.native
object distSrcModelsSubscriptionDashManagerMod extends js.Object {
  @js.native
  class SubscriptionManager () extends js.Object {
    def deleteToken(app: FirebaseApp, tokenDetails: TokenDetails): js.Promise[Unit] = js.native
    def getToken(app: FirebaseApp, subscription: PushSubscription, vapidKey: Uint8Array): js.Promise[String] = js.native
    /**
      * Update the underlying token details for fcmToken.
      */
    def updateToken(tokenDetails: TokenDetails, app: FirebaseApp, subscription: PushSubscription, vapidKey: Uint8Array): js.Promise[String] = js.native
  }
  
}

