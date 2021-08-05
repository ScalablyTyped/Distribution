package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcsTokenLink extends StObject {
  
  var acsTokenLink: js.UndefOr[String] = js.undefined
  
  var downloadLink: js.UndefOr[String] = js.undefined
  
  var isAvailable: js.UndefOr[Boolean] = js.undefined
}
object AcsTokenLink {
  
  inline def apply(): AcsTokenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcsTokenLink]
  }
  
  extension [Self <: AcsTokenLink](x: Self) {
    
    inline def setAcsTokenLink(value: String): Self = StObject.set(x, "acsTokenLink", value.asInstanceOf[js.Any])
    
    inline def setAcsTokenLinkUndefined: Self = StObject.set(x, "acsTokenLink", js.undefined)
    
    inline def setDownloadLink(value: String): Self = StObject.set(x, "downloadLink", value.asInstanceOf[js.Any])
    
    inline def setDownloadLinkUndefined: Self = StObject.set(x, "downloadLink", js.undefined)
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsAvailableUndefined: Self = StObject.set(x, "isAvailable", js.undefined)
  }
}
