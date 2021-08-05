package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdsAppearOn extends StObject {
  
  var adsAppearOn: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var siteLanguage: js.UndefOr[String] = js.undefined
}
object AdsAppearOn {
  
  inline def apply(): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsAppearOn]
  }
  
  extension [Self <: AdsAppearOn](x: Self) {
    
    inline def setAdsAppearOn(value: String): Self = StObject.set(x, "adsAppearOn", value.asInstanceOf[js.Any])
    
    inline def setAdsAppearOnUndefined: Self = StObject.set(x, "adsAppearOn", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
    
    inline def setSiteLanguageUndefined: Self = StObject.set(x, "siteLanguage", js.undefined)
  }
}
