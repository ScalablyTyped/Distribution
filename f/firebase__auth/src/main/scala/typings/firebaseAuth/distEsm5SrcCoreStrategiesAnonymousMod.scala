package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreStrategiesAnonymousMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/strategies/anonymous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
}
