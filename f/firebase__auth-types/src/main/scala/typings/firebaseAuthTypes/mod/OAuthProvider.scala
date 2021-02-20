package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "OAuthProvider")
@js.native
class OAuthProvider protected () extends AuthProvider {
  def this(providerId: String) = this()
  
  def addScope(scope: String): AuthProvider = js.native
  
  def credential(): OAuthCredential = js.native
  def credential(optionsOrIdToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: String, accessToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: Null, accessToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: OAuthCredentialOptions): OAuthCredential = js.native
  def credential(optionsOrIdToken: OAuthCredentialOptions, accessToken: String): OAuthCredential = js.native
  
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}
