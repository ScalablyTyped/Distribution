package typings.firebaseAuth

import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreStrategiesAnonymousMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/strategies/anonymous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
}
