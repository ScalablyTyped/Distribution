package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by federated provider.
  *
  * See auth.getUsers()
  */
trait ProviderIdentifier
  extends StObject
     with UserIdentifier {
  
  var providerId: String
  
  var providerUid: String
}
object ProviderIdentifier {
  
  inline def apply(providerId: String, providerUid: String): ProviderIdentifier = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIdentifier]
  }
  
  extension [Self <: ProviderIdentifier](x: Self) {
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderUid(value: String): Self = StObject.set(x, "providerUid", value.asInstanceOf[js.Any])
  }
}
