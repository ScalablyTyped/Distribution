package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
import typings.atFirebaseMessaging.distSrcInterfacesTokenDashDetailsMod.TokenDetails
import typings.atFirebaseMessaging.distSrcModelsDbDashInterfaceMod.DbInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/token-details-model", JSImport.Namespace)
@js.native
object distSrcModelsTokenDashDetailsDashModelMod extends js.Object {
  @js.native
  class TokenDetailsModel protected () extends DbInterface {
    def this(services: FirebaseInternalServices) = this()
    val services: js.Any = js.native
    /**
      * This method deletes details of the current FCM token.
      * It's returning a promise in case we need to move to an async
      * method for deleting at a later date.
      *
      * @return Resolves once the FCM token details have been deleted and returns
      * the deleted details.
      */
    def deleteToken(token: String): js.Promise[TokenDetails] = js.native
    /**
      * Given a service worker scope, this method will look up the details in
      * indexedDB.
      * @return The details associated with that token.
      */
    def getTokenDetailsFromSWScope(swScope: String): js.Promise[js.UndefOr[TokenDetails]] = js.native
    /**
      * Given a token, this method will look up the details in indexedDB.
      */
    def getTokenDetailsFromToken(fcmToken: String): js.Promise[js.UndefOr[TokenDetails]] = js.native
    /**
      * Save the details for the fcm token for re-use at a later date.
      * @param input A plain js object containing args to save.
      */
    def saveTokenDetails(tokenDetails: TokenDetails): js.Promise[Unit] = js.native
  }
  
}

