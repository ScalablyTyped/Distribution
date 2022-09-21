package typings.gestalt.mod

import typings.gestalt.anon.ValueString
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectListProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  def onChange(args: ValueString): Unit
  
  var options: js.Array[typings.gestalt.anon.Label]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object SelectListProps {
  
  inline def apply(id: String, onChange: ValueString => Unit, options: js.Array[typings.gestalt.anon.Label]): SelectListProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListProps]
  }
  
  extension [Self <: SelectListProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: ValueString => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOptions(value: js.Array[typings.gestalt.anon.Label]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: typings.gestalt.anon.Label*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
