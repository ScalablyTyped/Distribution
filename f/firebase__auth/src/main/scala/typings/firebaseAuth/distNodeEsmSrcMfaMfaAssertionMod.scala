package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typings.firebaseAuth.distNodeEsmSrcMfaMfaSessionMod.MultiFactorSessionImpl
import typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.FactorId
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.MultiFactorAssertion
import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.firebaseAuthStrings.totp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcMfaMfaAssertionMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/node-esm/src/mfa/mfa_assertion", "MultiFactorAssertionImpl")
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
