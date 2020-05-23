package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/helpers/idb-manager", JSImport.Namespace)
@js.native
object idbManagerMod extends js.Object {
  val DATABASE_NAME: /* "firebase-messaging-database" */ String = js.native
  def dbDelete(): js.Promise[Unit] = js.native
  def dbGet(firebaseDependencies: FirebaseInternalDependencies): js.Promise[js.UndefOr[TokenDetails]] = js.native
  def dbRemove(firebaseDependencies: FirebaseInternalDependencies): js.Promise[Unit] = js.native
  def dbSet(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[TokenDetails] = js.native
}

