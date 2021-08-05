package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedId extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var federatedId: js.UndefOr[String] = js.undefined
  
  var photoUrl: js.UndefOr[String] = js.undefined
  
  var providerId: js.UndefOr[String] = js.undefined
}
object FederatedId {
  
  inline def apply(): FederatedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedId]
  }
  
  extension [Self <: FederatedId](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
    
    inline def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
