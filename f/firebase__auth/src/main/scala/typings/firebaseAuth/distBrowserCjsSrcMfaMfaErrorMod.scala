package typings.firebaseAuth

import typings.firebaseAuth.anon.ServerResponseIdTokenMfaResponse
import typings.firebaseAuth.anon.`2`
import typings.firebaseAuth.distBrowserCjsSrcCoreCredentialsMod.AuthCredential
import typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distBrowserCjsSrcModelEnumsMod.OperationType
import typings.firebaseAuth.distBrowserCjsSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distBrowserCjsSrcModelUserMod.UserInternal
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcMfaMfaErrorMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/mfa_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/mfa_error", "MultiFactorError")
  @js.native
  /* private */ open class MultiFactorError ()
    extends typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorError {
    
    val operationType: OperationType = js.native
    
    val user: js.UndefOr[UserInternal] = js.native
  }
  /* static members */
  object MultiFactorError {
    
    @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/mfa_error", "MultiFactorError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromErrorAndOperation(auth: AuthInternal, error: FirebaseError, operationType: OperationType): MultiFactorError = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromErrorAndOperation")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any])).asInstanceOf[MultiFactorError]
    inline def _fromErrorAndOperation(auth: AuthInternal, error: FirebaseError, operationType: OperationType, user: UserInternal): MultiFactorError = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromErrorAndOperation")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[MultiFactorError]
  }
  
  inline def processCredentialSavingMfaContextIfNecessary(auth: AuthInternal, operationType: OperationType, credential: AuthCredential): js.Promise[IdTokenResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("_processCredentialSavingMfaContextIfNecessary")(auth.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResponse]]
  inline def processCredentialSavingMfaContextIfNecessary(auth: AuthInternal, operationType: OperationType, credential: AuthCredential, user: UserInternal): js.Promise[IdTokenResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("_processCredentialSavingMfaContextIfNecessary")(auth.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any], credential.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResponse]]
  
  type MultiFactorErrorData = (/* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.@firebase/auth/dist/browser-cjs/src/model/public_types.AuthError['customData'] */ js.Any) & `2` & ServerResponseIdTokenMfaResponse
}
