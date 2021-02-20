package typings.gestalt.mod

import typings.gestalt.gestaltStrings.circle
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.rectangle
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.square
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastProps extends StObject {
  
  var button: js.UndefOr[ReactNode] = js.native
  
  var color: js.UndefOr[darkGray | red] = js.native
  
  var text: js.UndefOr[String | ReactElement] = js.native
  
  var thumbnail: js.UndefOr[ReactNode] = js.native
  
  var thumbnailShape: js.UndefOr[circle | rectangle | square] = js.native
}
object ToastProps {
  
  @scala.inline
  def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  
  @scala.inline
  implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: ReactNode): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setColor(value: darkGray | red): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setText(value: String | ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setThumbnail(value: ReactNode): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailShape(value: circle | rectangle | square): Self = StObject.set(x, "thumbnailShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailShapeUndefined: Self = StObject.set(x, "thumbnailShape", js.undefined)
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
