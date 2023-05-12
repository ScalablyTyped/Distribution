package typings.gestalt.mod

import typings.gestalt.anon.Value
import typings.gestalt.gestaltStrings.`current-password`
import typings.gestalt.gestaltStrings.`new-password`
import typings.gestalt.gestaltStrings.bday
import typings.gestalt.gestaltStrings.date
import typings.gestalt.gestaltStrings.decimal
import typings.gestalt.gestaltStrings.email
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.numeric
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.password
import typings.gestalt.gestaltStrings.tel
import typings.gestalt.gestaltStrings.text
import typings.gestalt.gestaltStrings.url
import typings.gestalt.gestaltStrings.username
import typings.gestalt.gestaltStrings.visible
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFieldProps extends StObject {
  
  var autoComplete: js.UndefOr[bday | `current-password` | email | `new-password` | on | off | username] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[Node] = js.undefined
  
  var hasError: js.UndefOr[Boolean] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var maxLength: js.UndefOr[MaxLength] = js.undefined
  
  var mobileEnterKeyHint: js.UndefOr[MobileEnterKeyHintType] = js.undefined
  
  var mobileInputMode: js.UndefOr[none | text | decimal | numeric] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLInputElement, Element], Value]] = js.undefined
  
  var onChange: AbstractEventHandler[SyntheticEvent[HTMLInputElement, Event], Value]
  
  var onFocus: js.UndefOr[AbstractEventHandler[FocusEvent[HTMLInputElement, Element], Value]] = js.undefined
  
  var onKeyDown: js.UndefOr[AbstractEventHandler[KeyboardEvent[HTMLInputElement], Value]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var tags: js.UndefOr[js.Array[ReactElement]] = js.undefined
  
  var `type`: js.UndefOr[date | email | password | text | url | tel] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TextFieldProps {
  
  inline def apply(
    id: String,
    onChange: /* arg */ Value & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[TextFieldProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
    
    inline def setAutoComplete(value: bday | `current-password` | email | `new-password` | on | off | username): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: Node): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    inline def setHasErrorUndefined: Self = StObject.set(x, "hasError", js.undefined)
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxLength(value: MaxLength): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMobileEnterKeyHint(value: MobileEnterKeyHintType): Self = StObject.set(x, "mobileEnterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setMobileEnterKeyHintUndefined: Self = StObject.set(x, "mobileEnterKeyHint", js.undefined)
    
    inline def setMobileInputMode(value: none | text | decimal | numeric): Self = StObject.set(x, "mobileInputMode", value.asInstanceOf[js.Any])
    
    inline def setMobileInputModeUndefined: Self = StObject.set(x, "mobileInputMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(
      value: /* arg */ Value & (typings.gestalt.anon.Event[FocusEvent[HTMLInputElement, Element]]) => Unit
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(
      value: /* arg */ Value & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnFocus(
      value: /* arg */ Value & (typings.gestalt.anon.Event[FocusEvent[HTMLInputElement, Element]]) => Unit
    ): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* arg */ Value & typings.gestalt.anon.Event[KeyboardEvent[HTMLInputElement]] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTags(value: js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: date | email | password | text | url | tel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
