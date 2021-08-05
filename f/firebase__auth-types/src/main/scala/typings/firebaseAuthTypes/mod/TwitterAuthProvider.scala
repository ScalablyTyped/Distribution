package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "TwitterAuthProvider")
@js.native
class TwitterAuthProvider () extends TwitterAuthProviderInstance
/* static members */
object TwitterAuthProvider {
  
  @JSImport("@firebase/auth-types", "TwitterAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "TwitterAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
  @js.native
  def TWITTER_SIGN_IN_METHOD: String = js.native
  inline def TWITTER_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWITTER_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  inline def credential(token: String, secret: String): AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[AuthCredential]
}
