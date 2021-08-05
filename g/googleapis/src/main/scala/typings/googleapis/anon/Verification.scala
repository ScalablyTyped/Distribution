package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Verification extends StObject {
  
  var clientSpecificActorInfo: js.UndefOr[YoutubeActorInfo] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[Url] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var verification: js.UndefOr[AdHocVerified] = js.undefined
}
object Verification {
  
  inline def apply(): Verification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Verification]
  }
  
  extension [Self <: Verification](x: Self) {
    
    inline def setClientSpecificActorInfo(value: YoutubeActorInfo): Self = StObject.set(x, "clientSpecificActorInfo", value.asInstanceOf[js.Any])
    
    inline def setClientSpecificActorInfoUndefined: Self = StObject.set(x, "clientSpecificActorInfo", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: Url): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVerification(value: AdHocVerified): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
