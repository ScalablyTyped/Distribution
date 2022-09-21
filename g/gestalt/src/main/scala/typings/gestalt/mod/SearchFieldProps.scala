package typings.gestalt.mod

import typings.gestalt.anon.EventKeyboardEvent
import typings.gestalt.anon.SyntheticEvent
import typings.gestalt.anon.`2`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.name
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFieldProps extends StObject {
  
  var accessibilityClearButtonLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabel: String
  
  var autoComplete: js.UndefOr[on | off | username | name] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* args */ `2`, Unit]] = js.undefined
  
  def onChange(args: SyntheticEvent): Unit
  
  var onFocus: js.UndefOr[js.Function1[/* args */ SyntheticEvent, Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ EventKeyboardEvent, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object SearchFieldProps {
  
  inline def apply(accessibilityLabel: String, id: String, onChange: SyntheticEvent => Unit): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SearchFieldProps]
  }
  
  extension [Self <: SearchFieldProps](x: Self) {
    
    inline def setAccessibilityClearButtonLabel(value: String): Self = StObject.set(x, "accessibilityClearButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityClearButtonLabelUndefined: Self = StObject.set(x, "accessibilityClearButtonLabel", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: on | off | username | name): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnBlur(value: /* args */ `2` => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: SyntheticEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: /* args */ SyntheticEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* args */ EventKeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
