package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxGroupItemWithFilledProps
  extends StObject
     with FancyBoxGroupItem {
  
  @JSName("$thumb")
  var $thumb: js.UndefOr[JQuery] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var thumb: js.UndefOr[js.Any] = js.undefined
}
object FancyBoxGroupItemWithFilledProps {
  
  inline def apply(src: String): FancyBoxGroupItemWithFilledProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItemWithFilledProps]
  }
  
  extension [Self <: FancyBoxGroupItemWithFilledProps](x: Self) {
    
    inline def set$thumb(value: JQuery): Self = StObject.set(x, "$thumb", value.asInstanceOf[js.Any])
    
    inline def set$thumbUndefined: Self = StObject.set(x, "$thumb", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setThumb(value: js.Any): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
  }
}
