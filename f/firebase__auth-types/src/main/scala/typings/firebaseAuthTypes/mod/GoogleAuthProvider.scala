package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "GoogleAuthProvider")
@js.native
open class GoogleAuthProvider () extends GoogleAuthProviderInstance
/* static members */
object GoogleAuthProvider {
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
  @js.native
  def GOOGLE_SIGN_IN_METHOD: String = js.native
  inline def GOOGLE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOOGLE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  inline def credential(): AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[AuthCredential]
  inline def credential(idToken: String): AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[AuthCredential]
  inline def credential(idToken: String, accessToken: String): AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[AuthCredential]
  inline def credential(idToken: Null, accessToken: String): AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[AuthCredential]
  inline def credential(idToken: Unit, accessToken: String): AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[AuthCredential]
}
