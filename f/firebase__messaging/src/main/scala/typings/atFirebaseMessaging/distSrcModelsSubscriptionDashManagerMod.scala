package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
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
    def deleteToken(services: FirebaseInternalServices, tokenDetails: TokenDetails): js.Promise[Unit] = js.native
    def getToken(services: FirebaseInternalServices, subscription: PushSubscription, vapidKey: Uint8Array): js.Promise[String] = js.native
    /**
      * Update the underlying token details for fcmToken.
      */
    def updateToken(
      tokenDetails: TokenDetails,
      services: FirebaseInternalServices,
      subscription: PushSubscription,
      vapidKey: Uint8Array
    ): js.Promise[String] = js.native
  }
  
}

