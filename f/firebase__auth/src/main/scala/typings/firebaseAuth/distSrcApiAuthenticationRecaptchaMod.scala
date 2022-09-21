package typings.firebaseAuth

import typings.firebaseAuth.distSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiAuthenticationRecaptchaMod {
  
  @JSImport("@firebase/auth/dist/src/api/authentication/recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRecaptchaParams(auth: Auth): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecaptchaParams")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
