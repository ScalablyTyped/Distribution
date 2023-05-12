package typings.gestalt.mod

import typings.gestalt.anon.Children
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetMobileProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var align: js.UndefOr[start | center] = js.undefined
  
  var backIconButton: js.UndefOr[Children] = js.undefined
  
  var heading: String
  
  def onDismiss(): Unit
}
object SheetMobileProps {
  
  inline def apply(heading: String, onDismiss: () => Unit): SheetMobileProps = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[SheetMobileProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetMobileProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAlign(value: start | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackIconButton(value: Children): Self = StObject.set(x, "backIconButton", value.asInstanceOf[js.Any])
    
    inline def setBackIconButtonUndefined: Self = StObject.set(x, "backIconButton", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
  }
}
