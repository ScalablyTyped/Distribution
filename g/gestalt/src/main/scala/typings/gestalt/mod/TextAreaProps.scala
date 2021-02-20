package typings.gestalt.mod

import typings.gestalt.anon.ValueString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var helperText: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* args */ ValueString, Unit]] = js.native
  
  def onChange(args: ValueString): Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* args */ ValueString, Unit]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ ValueString, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TextAreaProps {
  
  @scala.inline
  def apply(id: String, onChange: ValueString => Unit): TextAreaProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[TextAreaProps]
  }
  
  @scala.inline
  implicit class TextAreaPropsMutableBuilder[Self <: TextAreaProps] (val x: Self) extends AnyVal {
    
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
    def setOnBlur(value: /* args */ ValueString => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: ValueString => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocus(value: /* args */ ValueString => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* args */ ValueString => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
