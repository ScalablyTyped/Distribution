package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents an auth provider.
  */
@js.native
trait AuthProvider extends StObject {
  
  var providerId: String = js.native
}
object AuthProvider {
  
  @scala.inline
  def apply(providerId: String): AuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProvider]
  }
  
  @scala.inline
  implicit class AuthProviderMutableBuilder[Self <: AuthProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
