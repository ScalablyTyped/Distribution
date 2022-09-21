package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppIcon extends StObject {
  
  var advertiser: js.UndefOr[String] = js.undefined
  
  var appIcon: js.UndefOr[Height] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var callToAction: js.UndefOr[String] = js.undefined
  
  var clickLinkUrl: js.UndefOr[String] = js.undefined
  
  var clickTrackingUrl: js.UndefOr[String] = js.undefined
  
  var headline: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[Height] = js.undefined
  
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.undefined
  
  var logo: js.UndefOr[Height] = js.undefined
  
  var price: js.UndefOr[String] = js.undefined
  
  var starRating: js.UndefOr[Double] = js.undefined
  
  var videoURL: js.UndefOr[String] = js.undefined
}
object AppIcon {
  
  inline def apply(): AppIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppIcon]
  }
  
  extension [Self <: AppIcon](x: Self) {
    
    inline def setAdvertiser(value: String): Self = StObject.set(x, "advertiser", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserUndefined: Self = StObject.set(x, "advertiser", js.undefined)
    
    inline def setAppIcon(value: Height): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
    
    inline def setAppIconUndefined: Self = StObject.set(x, "appIcon", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCallToAction(value: String): Self = StObject.set(x, "callToAction", value.asInstanceOf[js.Any])
    
    inline def setCallToActionUndefined: Self = StObject.set(x, "callToAction", js.undefined)
    
    inline def setClickLinkUrl(value: String): Self = StObject.set(x, "clickLinkUrl", value.asInstanceOf[js.Any])
    
    inline def setClickLinkUrlUndefined: Self = StObject.set(x, "clickLinkUrl", js.undefined)
    
    inline def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setImage(value: Height): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImpressionTrackingUrl(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setImpressionTrackingUrlUndefined: Self = StObject.set(x, "impressionTrackingUrl", js.undefined)
    
    inline def setImpressionTrackingUrlVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrl", js.Array(value*))
    
    inline def setLogo(value: Height): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setStarRating(value: Double): Self = StObject.set(x, "starRating", value.asInstanceOf[js.Any])
    
    inline def setStarRatingUndefined: Self = StObject.set(x, "starRating", js.undefined)
    
    inline def setVideoURL(value: String): Self = StObject.set(x, "videoURL", value.asInstanceOf[js.Any])
    
    inline def setVideoURLUndefined: Self = StObject.set(x, "videoURL", js.undefined)
  }
}
