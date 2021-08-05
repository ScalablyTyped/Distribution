package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraLarge extends StObject {
  
  var extraLarge: js.UndefOr[String] = js.undefined
  
  var large: js.UndefOr[String] = js.undefined
  
  var medium: js.UndefOr[String] = js.undefined
  
  var small: js.UndefOr[String] = js.undefined
  
  var smallThumbnail: js.UndefOr[String] = js.undefined
  
  var thumbnail: js.UndefOr[String] = js.undefined
}
object ExtraLarge {
  
  inline def apply(): ExtraLarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraLarge]
  }
  
  extension [Self <: ExtraLarge](x: Self) {
    
    inline def setExtraLarge(value: String): Self = StObject.set(x, "extraLarge", value.asInstanceOf[js.Any])
    
    inline def setExtraLargeUndefined: Self = StObject.set(x, "extraLarge", js.undefined)
    
    inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallThumbnail(value: String): Self = StObject.set(x, "smallThumbnail", value.asInstanceOf[js.Any])
    
    inline def setSmallThumbnailUndefined: Self = StObject.set(x, "smallThumbnail", js.undefined)
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
