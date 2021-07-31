package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "FacebookAuthProvider")
@js.native
class FacebookAuthProvider () extends FacebookAuthProviderInstance
/* static members */
object FacebookAuthProvider {
  
  @JSImport("@firebase/auth-types", "FacebookAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
  @js.native
  def FACEBOOK_SIGN_IN_METHOD: String = js.native
  @scala.inline
  def FACEBOOK_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACEBOOK_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "FacebookAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  @scala.inline
  def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def credential(token: String): AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any]).asInstanceOf[AuthCredential]
}
