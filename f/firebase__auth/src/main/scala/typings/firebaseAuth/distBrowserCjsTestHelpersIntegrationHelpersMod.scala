package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsTestHelpersIntegrationHelpersMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/test/helpers/integration/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanUpTestInstance(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpTestInstance")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@firebase/auth/dist/browser-cjs/test/helpers/integration/helpers", "email")
  @js.native
  val email: /* "totpuser-donotdelete@test.com" */ String = js.native
  
  inline def getTestInstance(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestInstance")().asInstanceOf[Auth]
  inline def getTestInstance(requireEmulator: Boolean): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestInstance")(requireEmulator.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  inline def getTotpCode(sharedSecretKey: String, periodSec: Double, verificationCodeLength: Double, timestamp: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotpCode")(sharedSecretKey.asInstanceOf[js.Any], periodSec.asInstanceOf[js.Any], verificationCodeLength.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@firebase/auth/dist/browser-cjs/test/helpers/integration/helpers", "incorrectTotpCode")
  @js.native
  val incorrectTotpCode: /* "1000000" */ String = js.native
  
  inline def randomEmail(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomEmail")().asInstanceOf[String]
}
