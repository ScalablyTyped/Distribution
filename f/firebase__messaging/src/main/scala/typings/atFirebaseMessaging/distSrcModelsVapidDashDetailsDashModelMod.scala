package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.distSrcModelsDbDashInterfaceMod.DbInterface
import typings.std.IDBOpenDBRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/vapid-details-model", JSImport.Namespace)
@js.native
object distSrcModelsVapidDashDetailsDashModelMod extends js.Object {
  @js.native
  class VapidDetailsModel () extends DbInterface {
    /**
      * This method deletes details of the current FCM VAPID key for a SW scope.
      * Resolves once the scope/vapid details have been deleted and returns the
      * deleted vapid key.
      */
    def deleteVapidDetails(swScope: String): js.Promise[Uint8Array] = js.native
    /**
      * Given a service worker scope, this method will look up the vapid key
      * in indexedDB.
      */
    def getVapidFromSWScope(swScope: String): js.Promise[js.UndefOr[Uint8Array]] = js.native
    /* protected */ def onDbUpgrade(request: IDBOpenDBRequest): Unit = js.native
    /**
      * Save a vapid key against a swScope for later date.
      */
    def saveVapidDetails(swScope: String, vapidKey: Uint8Array): js.Promise[Unit] = js.native
  }
  
}

