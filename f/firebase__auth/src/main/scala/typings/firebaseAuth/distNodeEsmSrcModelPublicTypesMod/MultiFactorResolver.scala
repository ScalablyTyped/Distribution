package typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorResolver extends StObject {
  
  /**
    * The list of hints for the second factors needed to complete the sign-in for the current
    * session.
    */
  val hints: js.Array[MultiFactorInfo]
  
  /**
    * A helper function to help users complete sign in with a second factor using an
    * {@link MultiFactorAssertion} confirming the user successfully completed the second factor
    * challenge.
    *
    * @example
    * ```javascript
    * const phoneAuthCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
    * const multiFactorAssertion = PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
    * const userCredential = await resolver.resolveSignIn(multiFactorAssertion);
    * ```
    *
    * @param assertion - The multi-factor assertion to resolve sign-in with.
    * @returns The promise that resolves with the user credential object.
    */
  def resolveSignIn(assertion: MultiFactorAssertion): js.Promise[UserCredential]
  
  /**
    * The session identifier for the current sign-in flow, which can be used to complete the second
    * factor sign-in.
    */
  val session: MultiFactorSession
}
object MultiFactorResolver {
  
  inline def apply(
    hints: js.Array[MultiFactorInfo],
    resolveSignIn: MultiFactorAssertion => js.Promise[UserCredential],
    session: MultiFactorSession
  ): MultiFactorResolver = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any], resolveSignIn = js.Any.fromFunction1(resolveSignIn), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorResolver]
  }
  
  extension [Self <: MultiFactorResolver](x: Self) {
    
    inline def setHints(value: js.Array[MultiFactorInfo]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsVarargs(value: MultiFactorInfo*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setResolveSignIn(value: MultiFactorAssertion => js.Promise[UserCredential]): Self = StObject.set(x, "resolveSignIn", js.Any.fromFunction1(value))
    
    inline def setSession(value: MultiFactorSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
