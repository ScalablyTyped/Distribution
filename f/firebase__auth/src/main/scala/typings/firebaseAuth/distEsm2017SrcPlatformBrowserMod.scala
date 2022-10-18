package typings.firebaseAuth

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcPlatformBrowserMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[Auth]
  inline def getAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
}
