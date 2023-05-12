package typings.gestalt.mod

import typings.gestalt.anon.`1`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFieldProps extends StObject {
  
  var autoComplete: js.UndefOr[on | off] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[Node] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var mobileEnterKeyHint: js.UndefOr[MobileEnterKeyHintType] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLInputElement, Element], `1`]] = js.undefined
  
  var onChange: AbstractEventHandler[SyntheticEvent[HTMLInputElement, Event], `1`]
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLInputElement, Element], `1`]] = js.undefined
  
  var onKeyDown: js.UndefOr[AbstractEventHandler[KeyboardEvent[HTMLInputElement], `1`]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object NumberFieldProps {
  
  inline def apply(
    id: String,
    onChange: /* arg */ `1` & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
  ): NumberFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[NumberFieldProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFieldProps] (val x: Self) extends AnyVal {
    
    inline def setAutoComplete(value: on | off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: Node): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMobileEnterKeyHint(value: MobileEnterKeyHintType): Self = StObject.set(x, "mobileEnterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setMobileEnterKeyHintUndefined: Self = StObject.set(x, "mobileEnterKeyHint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(value: /* arg */ `1` & (typings.gestalt.anon.Event[FocusEvent[HTMLInputElement, Element]]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(
      value: /* arg */ `1` & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: /* arg */ `1` & (typings.gestalt.anon.Event[FocusEvent[HTMLInputElement, Element]]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* arg */ `1` & typings.gestalt.anon.Event[KeyboardEvent[HTMLInputElement]] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
