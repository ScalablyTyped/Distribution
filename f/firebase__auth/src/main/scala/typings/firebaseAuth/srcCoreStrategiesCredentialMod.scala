package typings.firebaseAuth

import typings.firebaseAuth.nodeEsmSrcCoreCredentialsMod.AuthCredential
import typings.firebaseAuth.nodeEsmSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.User
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreStrategiesCredentialMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/strategies/credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _signInWithCredential(auth: AuthInternal, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def _signInWithCredential(auth: AuthInternal, credential: AuthCredential, bypassAuthState: Boolean): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithCredential(user: User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithCredential(user: User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: Auth, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
