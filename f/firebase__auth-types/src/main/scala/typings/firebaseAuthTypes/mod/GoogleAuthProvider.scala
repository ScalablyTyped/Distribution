package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "GoogleAuthProvider")
@js.native
class GoogleAuthProvider () extends GoogleAuthProviderInstance
/* static members */
object GoogleAuthProvider {
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
  @js.native
  def GOOGLE_SIGN_IN_METHOD: String = js.native
  @scala.inline
  def GOOGLE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOOGLE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  @scala.inline
  def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.credential")
  @js.native
  def credential(): AuthCredential = js.native
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.credential")
  @js.native
  def credential(idToken: js.UndefOr[scala.Nothing], accessToken: String): AuthCredential = js.native
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.credential")
  @js.native
  def credential(idToken: String): AuthCredential = js.native
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.credential")
  @js.native
  def credential(idToken: String, accessToken: String): AuthCredential = js.native
  @JSImport("@firebase/auth-types", "GoogleAuthProvider.credential")
  @js.native
  def credential(idToken: Null, accessToken: String): AuthCredential = js.native
}
