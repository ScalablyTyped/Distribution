package typings.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLAuthProvider extends AuthProvider
object SAMLAuthProvider {
  
  @scala.inline
  def apply(providerId: String): SAMLAuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLAuthProvider]
  }
}
