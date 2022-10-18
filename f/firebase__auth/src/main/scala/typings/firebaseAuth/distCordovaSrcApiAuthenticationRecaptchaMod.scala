package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcApiAuthenticationRecaptchaMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/api/authentication/recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRecaptchaParams(auth: Auth): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecaptchaParams")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
