package typings.gestalt.mod

import typings.gestalt.gestaltStrings.circle
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.rectangle
import typings.gestalt.gestaltStrings.square
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastProps extends StObject {
  
  var button: js.UndefOr[ReactNode] = js.undefined
  
  var text: js.UndefOr[String | ReactNode] = js.undefined
  
  var thumbnail: js.UndefOr[ReactNode] = js.undefined
  
  var thumbnailShape: js.UndefOr[circle | rectangle | square] = js.undefined
  
  var variant: js.UndefOr[default | error] = js.undefined
}
object ToastProps {
  
  inline def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  
  extension [Self <: ToastProps](x: Self) {
    
    inline def setButton(value: ReactNode): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setText(value: String | ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThumbnail(value: ReactNode): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailShape(value: circle | rectangle | square): Self = StObject.set(x, "thumbnailShape", value.asInstanceOf[js.Any])
    
    inline def setThumbnailShapeUndefined: Self = StObject.set(x, "thumbnailShape", js.undefined)
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setVariant(value: default | error): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
