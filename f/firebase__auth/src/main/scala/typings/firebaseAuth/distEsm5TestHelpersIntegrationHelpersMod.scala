package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5TestHelpersIntegrationHelpersMod {
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/integration/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanUpTestInstance(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpTestInstance")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getTestInstance(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestInstance")().asInstanceOf[Auth]
  inline def getTestInstance(requireEmulator: Boolean): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestInstance")(requireEmulator.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  inline def randomEmail(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomEmail")().asInstanceOf[String]
}
