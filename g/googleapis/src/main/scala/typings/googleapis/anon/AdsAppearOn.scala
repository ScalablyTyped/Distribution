package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdsAppearOn extends StObject {
  
  var adsAppearOn: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var siteLanguage: js.UndefOr[String] = js.native
}
object AdsAppearOn {
  
  @scala.inline
  def apply(): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsAppearOn]
  }
  
  @scala.inline
  implicit class AdsAppearOnMutableBuilder[Self <: AdsAppearOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdsAppearOn(value: String): Self = StObject.set(x, "adsAppearOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsAppearOnUndefined: Self = StObject.set(x, "adsAppearOn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteLanguageUndefined: Self = StObject.set(x, "siteLanguage", js.undefined)
  }
}
