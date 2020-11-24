package typings.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
@js.native
trait EmailAuthProviderInstance extends AuthProvider
object EmailAuthProviderInstance {
  
  @scala.inline
  def apply(providerId: String): EmailAuthProviderInstance = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAuthProviderInstance]
  }
}
