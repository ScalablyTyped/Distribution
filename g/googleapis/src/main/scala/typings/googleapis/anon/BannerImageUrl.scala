package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerImageUrl extends StObject {
  
  var bannerImageUrl: js.UndefOr[String] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var seriesId: js.UndefOr[String] = js.undefined
  
  var seriesType: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object BannerImageUrl {
  
  inline def apply(): BannerImageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerImageUrl]
  }
  
  extension [Self <: BannerImageUrl](x: Self) {
    
    inline def setBannerImageUrl(value: String): Self = StObject.set(x, "bannerImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerImageUrlUndefined: Self = StObject.set(x, "bannerImageUrl", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setSeriesId(value: String): Self = StObject.set(x, "seriesId", value.asInstanceOf[js.Any])
    
    inline def setSeriesIdUndefined: Self = StObject.set(x, "seriesId", js.undefined)
    
    inline def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
