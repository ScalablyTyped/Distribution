package typings.firebaseAuth

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.distNodeSrcCoreAuthAuthImplMod.AuthImpl
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreAuthInitializeMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/auth/initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def initializeAuthInstance(auth: AuthImpl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAuthInstance")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initializeAuthInstance(auth: AuthImpl, deps: Dependencies): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAuthInstance")(auth.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
