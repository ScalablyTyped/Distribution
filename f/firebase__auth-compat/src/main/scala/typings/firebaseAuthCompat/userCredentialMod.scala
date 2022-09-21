package typings.firebaseAuthCompat

import typings.firebaseAuthTypes.mod.ConfirmationResult
import typings.firebaseAuthTypes.mod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userCredentialMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/user_credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertConfirmationResult(
    auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any,
    confirmationResultPromise: js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.ConfirmationResult */ Any
    ]
  ): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertConfirmationResult")(auth.asInstanceOf[js.Any], confirmationResultPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def convertCredential(
    auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any,
    credentialPromise: js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.UserCredential */ Any
    ]
  ): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertCredential")(auth.asInstanceOf[js.Any], credentialPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
