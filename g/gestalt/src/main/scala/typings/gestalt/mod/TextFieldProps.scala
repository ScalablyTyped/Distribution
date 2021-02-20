package typings.gestalt.mod

import typings.gestalt.anon.EventSyntheticEventValueString
import typings.gestalt.anon.`1`
import typings.gestalt.anon.`2`
import typings.gestalt.gestaltStrings.`current-password`
import typings.gestalt.gestaltStrings.`new-password`
import typings.gestalt.gestaltStrings.date
import typings.gestalt.gestaltStrings.email
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.number
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.password
import typings.gestalt.gestaltStrings.text
import typings.gestalt.gestaltStrings.url
import typings.gestalt.gestaltStrings.username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldProps extends StObject {
  
  var autoComplete: js.UndefOr[`current-password` | on | off | username | `new-password`] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var helperText: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* args */ `1`, Unit]] = js.native
  
  def onChange(args: EventSyntheticEventValueString): Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* args */ `1`, Unit]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ `2`, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[md | lg] = js.native
  
  var `type`: js.UndefOr[date | email | number | password | text | url] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TextFieldProps {
  
  @scala.inline
  def apply(id: String, onChange: EventSyntheticEventValueString => Unit): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[TextFieldProps]
  }
  
  @scala.inline
  implicit class TextFieldPropsMutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: `current-password` | on | off | username | `new-password`): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* args */ `1` => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: EventSyntheticEventValueString => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocus(value: /* args */ `1` => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* args */ `2` => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: date | email | number | password | text | url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
