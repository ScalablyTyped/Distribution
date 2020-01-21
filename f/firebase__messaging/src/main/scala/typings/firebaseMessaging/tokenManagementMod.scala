package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/core/token-management", JSImport.Namespace)
@js.native
object tokenManagementMod extends js.Object {
  def deleteToken(firebaseDependencies: FirebaseInternalDependencies, swRegistration: ServiceWorkerRegistration): js.Promise[Boolean] = js.native
  def getToken(
    firebaseDependencies: FirebaseInternalDependencies,
    swRegistration: ServiceWorkerRegistration,
    vapidKey: String
  ): js.Promise[String] = js.native
}

