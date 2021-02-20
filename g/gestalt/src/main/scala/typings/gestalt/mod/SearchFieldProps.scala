package typings.gestalt.mod

import typings.gestalt.anon.SyntheticEvent
import typings.gestalt.anon.`0`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.name
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFieldProps extends StObject {
  
  var accessibilityLabel: String = js.native
  
  var autoComplete: js.UndefOr[on | off | username | name] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* args */ `0`, Unit]] = js.native
  
  def onChange(args: SyntheticEvent): Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* args */ SyntheticEvent, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[md | lg] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SearchFieldProps {
  
  @scala.inline
  def apply(accessibilityLabel: String, id: String, onChange: SyntheticEvent => Unit): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SearchFieldProps]
  }
  
  @scala.inline
  implicit class SearchFieldPropsMutableBuilder[Self <: SearchFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoComplete(value: on | off | username | name): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: /* args */ `0` => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocus(value: /* args */ SyntheticEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
