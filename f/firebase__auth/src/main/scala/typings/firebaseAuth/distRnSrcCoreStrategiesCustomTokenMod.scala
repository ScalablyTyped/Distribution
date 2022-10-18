package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcCoreStrategiesCustomTokenMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/strategies/custom_token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
