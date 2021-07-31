package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerElementEditorItem extends StObject {
  
  var displayValue: String
  
  var value: js.Any
}
object ASPxDesignerElementEditorItem {
  
  @scala.inline
  def apply(displayValue: String, value: js.Any): ASPxDesignerElementEditorItem = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementEditorItem]
  }
  
  @scala.inline
  implicit class ASPxDesignerElementEditorItemMutableBuilder[Self <: ASPxDesignerElementEditorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
