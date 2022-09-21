package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseInstallations.mod.IdChangeCallbackFn
import typings.firebaseInstallations.mod.IdChangeUnsubscribeFn
import typings.firebaseInstallations.mod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsDistInstallationsMod {
  
  @JSImport("firebase/compat/analytics/dist/installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteInstallations(installations: Installations): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallations")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getId(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getInstallations(): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[Installations]
  inline def getInstallations(app: FirebaseApp): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")(app.asInstanceOf[js.Any]).asInstanceOf[Installations]
  
  inline def getToken(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(installations: Installations, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def onIdChange(installations: Installations, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdChange")(installations.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IdChangeUnsubscribeFn]
}
