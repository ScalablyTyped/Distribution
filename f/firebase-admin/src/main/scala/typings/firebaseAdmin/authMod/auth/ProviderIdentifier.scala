package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by federated provider.
  *
  * See auth.getUsers()
  */
@js.native
trait ProviderIdentifier extends UserIdentifier {
  
  var providerId: String = js.native
  
  var providerUid: String = js.native
}
object ProviderIdentifier {
  
  @scala.inline
  def apply(providerId: String, providerUid: String): ProviderIdentifier = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIdentifier]
  }
  
  @scala.inline
  implicit class ProviderIdentifierMutableBuilder[Self <: ProviderIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUid(value: String): Self = StObject.set(x, "providerUid", value.asInstanceOf[js.Any])
  }
}
