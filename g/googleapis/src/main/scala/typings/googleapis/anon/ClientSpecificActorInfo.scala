package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSpecificActorInfo extends StObject {
  
  var clientSpecificActorInfo: js.UndefOr[YoutubeActorInfo] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[Url] = js.undefined
  
  var name: js.UndefOr[FamilyName] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var verification: js.UndefOr[AdHocVerified] = js.undefined
}
object ClientSpecificActorInfo {
  
  @scala.inline
  def apply(): ClientSpecificActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSpecificActorInfo]
  }
  
  @scala.inline
  implicit class ClientSpecificActorInfoMutableBuilder[Self <: ClientSpecificActorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientSpecificActorInfo(value: YoutubeActorInfo): Self = StObject.set(x, "clientSpecificActorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSpecificActorInfoUndefined: Self = StObject.set(x, "clientSpecificActorInfo", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: Url): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVerification(value: AdHocVerified): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
