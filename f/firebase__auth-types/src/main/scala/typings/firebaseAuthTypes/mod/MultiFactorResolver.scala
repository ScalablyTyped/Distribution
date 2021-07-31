package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "MultiFactorResolver")
@js.native
class MultiFactorResolver protected () extends StObject {
  
  var auth: FirebaseAuth = js.native
  
  var hints: js.Array[MultiFactorInfo] = js.native
  
  def resolveSignIn(assertion: MultiFactorAssertion): js.Promise[UserCredential] = js.native
  
  var session: MultiFactorSession = js.native
}
