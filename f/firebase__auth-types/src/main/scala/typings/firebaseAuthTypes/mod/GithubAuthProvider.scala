package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "GithubAuthProvider")
@js.native
class GithubAuthProvider () extends GithubAuthProviderInstance
/* static members */
object GithubAuthProvider {
  
  @JSImport("@firebase/auth-types", "GithubAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
  @js.native
  def GITHUB_SIGN_IN_METHOD: String = js.native
  @scala.inline
  def GITHUB_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GITHUB_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "GithubAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  @scala.inline
  def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "GithubAuthProvider.credential")
  @js.native
  def credential(token: String): AuthCredential = js.native
}
