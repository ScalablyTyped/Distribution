package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "PhoneAuthProvider_Instance")
@js.native
open class PhoneAuthProviderInstance ()
  extends StObject
     with AuthProvider {
  def this(auth: FirebaseAuth) = this()
  
  /* CompleteClass */
  var providerId: String = js.native
  
  def verifyPhoneNumber(phoneInfoOptions: String, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
  def verifyPhoneNumber(phoneInfoOptions: PhoneInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
}
