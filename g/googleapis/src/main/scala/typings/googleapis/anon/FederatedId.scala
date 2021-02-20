package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedId extends StObject {
  
  var displayName: js.UndefOr[String] = js.native
  
  var federatedId: js.UndefOr[String] = js.native
  
  var photoUrl: js.UndefOr[String] = js.native
  
  var providerId: js.UndefOr[String] = js.native
}
object FederatedId {
  
  @scala.inline
  def apply(): FederatedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedId]
  }
  
  @scala.inline
  implicit class FederatedIdMutableBuilder[Self <: FederatedId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
