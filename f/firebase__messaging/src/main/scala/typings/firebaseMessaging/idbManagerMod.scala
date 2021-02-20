package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idbManagerMod {
  
  @JSImport("@firebase/messaging/dist/helpers/idb-manager", "DATABASE_NAME")
  @js.native
  val DATABASE_NAME: /* "firebase-messaging-database" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/helpers/idb-manager", "dbDelete")
  @js.native
  def dbDelete(): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/messaging/dist/helpers/idb-manager", "dbGet")
  @js.native
  def dbGet(firebaseDependencies: FirebaseInternalDependencies): js.Promise[js.UndefOr[TokenDetails]] = js.native
  
  @JSImport("@firebase/messaging/dist/helpers/idb-manager", "dbRemove")
  @js.native
  def dbRemove(firebaseDependencies: FirebaseInternalDependencies): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/messaging/dist/helpers/idb-manager", "dbSet")
  @js.native
  def dbSet(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[TokenDetails] = js.native
}
