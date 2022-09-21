package typings.firebaseAuth

import typings.firebaseAuth.modelPublicTypesMod.Auth
import typings.firebaseAuth.modelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreStrategiesCustomTokenMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/strategies/custom_token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
