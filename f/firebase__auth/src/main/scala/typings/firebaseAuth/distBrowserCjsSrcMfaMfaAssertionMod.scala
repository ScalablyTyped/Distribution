package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typings.firebaseAuth.distBrowserCjsSrcMfaMfaSessionMod.MultiFactorSessionImpl
import typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.FactorId
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorAssertion
import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.firebaseAuthStrings.totp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcMfaMfaAssertionMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/mfa_assertion", "MultiFactorAssertionImpl")
  @js.native
  open class MultiFactorAssertionImpl protected ()
    extends StObject
       with MultiFactorAssertion {
    /* protected */ def this(factorId: FactorId) = this()
    
    def _finalizeEnroll(auth: AuthInternal, idToken: String): js.Promise[FinalizeMfaResponse] = js.native
    def _finalizeEnroll(auth: AuthInternal, idToken: String, displayName: String): js.Promise[FinalizeMfaResponse] = js.native
    
    def _finalizeSignIn(auth: AuthInternal, mfaPendingCredential: String): js.Promise[FinalizeMfaResponse] = js.native
    
    def _process(auth: AuthInternal, session: MultiFactorSessionImpl): js.Promise[FinalizeMfaResponse] = js.native
    def _process(auth: AuthInternal, session: MultiFactorSessionImpl, displayName: String): js.Promise[FinalizeMfaResponse] = js.native
    
    /** The identifier of the second factor. */
    /* CompleteClass */
    override val factorId: phone | totp = js.native
    @JSName("factorId")
    val factorId_MultiFactorAssertionImpl: FactorId = js.native
  }
}
