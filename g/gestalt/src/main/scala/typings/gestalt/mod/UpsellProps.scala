package typings.gestalt.mod

import typings.gestalt.anon.AccessibilityLabel
import typings.gestalt.anon.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsellProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.undefined
  
  var imageData: js.UndefOr[Component] = js.undefined
  
  var message: String
  
  var primaryAction: js.UndefOr[ActionData] = js.undefined
  
  var secondaryAction: js.UndefOr[ActionData] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object UpsellProps {
  
  inline def apply(message: String): UpsellProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsellProps]
  }
  
  extension [Self <: UpsellProps](x: Self) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    inline def setImageData(value: Component): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAction(value: ActionData): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setSecondaryAction(value: ActionData): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
    
    inline def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
