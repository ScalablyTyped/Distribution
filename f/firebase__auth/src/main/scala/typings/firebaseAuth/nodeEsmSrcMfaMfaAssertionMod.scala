package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.nodeEsmSrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typings.firebaseAuth.nodeEsmSrcMfaMfaSessionMod.MultiFactorSessionImpl
import typings.firebaseAuth.nodeEsmSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.FactorId
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.MultiFactorAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEsmSrcMfaMfaAssertionMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/mfa/mfa_assertion", "MultiFactorAssertionImpl")
  @js.native
  abstract class MultiFactorAssertionImpl protected ()
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
    override val factorId: phone = js.native
    @JSName("factorId")
    val factorId_MultiFactorAssertionImpl: FactorId = js.native
  }
}
