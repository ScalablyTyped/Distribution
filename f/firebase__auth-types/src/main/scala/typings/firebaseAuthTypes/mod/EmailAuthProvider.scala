package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "EmailAuthProvider")
@js.native
class EmailAuthProvider () extends EmailAuthProviderInstance
/* static members */
object EmailAuthProvider {
  
  @JSImport("@firebase/auth-types", "EmailAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
  @js.native
  def EMAIL_LINK_SIGN_IN_METHOD: String = js.native
  @scala.inline
  def EMAIL_LINK_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_LINK_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
  @js.native
  def EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
  @scala.inline
  def EMAIL_PASSWORD_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_PASSWORD_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "EmailAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  @scala.inline
  def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "EmailAuthProvider.credential")
  @js.native
  def credential(email: String, password: String): AuthCredential = js.native
  
  @JSImport("@firebase/auth-types", "EmailAuthProvider.credentialWithLink")
  @js.native
  def credentialWithLink(email: String, emailLink: String): AuthCredential = js.native
}
