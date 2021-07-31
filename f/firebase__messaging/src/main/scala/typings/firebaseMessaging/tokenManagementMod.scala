package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenManagementMod {
  
  @JSImport("@firebase/messaging/dist/core/token-management", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deleteToken(firebaseDependencies: FirebaseInternalDependencies, swRegistration: ServiceWorkerRegistration): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(firebaseDependencies.asInstanceOf[js.Any], swRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def getToken(
    firebaseDependencies: FirebaseInternalDependencies,
    swRegistration: ServiceWorkerRegistration,
    vapidKey: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(firebaseDependencies.asInstanceOf[js.Any], swRegistration.asInstanceOf[js.Any], vapidKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
