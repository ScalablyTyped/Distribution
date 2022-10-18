package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libAppCoreMod.AppOptions
import typings.firebaseAdmin.libAppCredentialMod.Credential
import typings.firebaseAdmin.libAppCredentialMod.ServiceAccount
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object appMod {
  
  @JSImport("firebase-admin/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/app", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  inline def applicationDefault(): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")().asInstanceOf[Credential]
  inline def applicationDefault(httpAgent: Agent): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")(httpAgent.asInstanceOf[js.Any]).asInstanceOf[Credential]
  
  inline def cert(serviceAccountPathOrObject: String): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
  inline def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
  inline def cert(serviceAccountPathOrObject: ServiceAccount): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
  inline def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
  
  inline def deleteApp(app: App): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteApp")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[App]
  inline def getApp(appName: String): App = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")(appName.asInstanceOf[js.Any]).asInstanceOf[App]
  
  inline def getApps(): js.Array[App] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApps")().asInstanceOf[js.Array[App]]
  
  inline def initializeApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[App]
  inline def initializeApp(options: Unit, appName: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[App]
  inline def initializeApp(options: AppOptions): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[App]
  inline def initializeApp(options: AppOptions, appName: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[App]
  
  inline def refreshToken(refreshTokenPathOrObject: String): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
  inline def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
  inline def refreshToken(refreshTokenPathOrObject: js.Object): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
  inline def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
}
