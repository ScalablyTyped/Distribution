package typings.gestalt.mod

import typings.gestalt.anon.Checked
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var hasError: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var image: js.UndefOr[ReactNode] = js.undefined
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: AbstractEventHandler[SyntheticEvent[HTMLInputElement, Event], Checked]
  
  var onClick: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLInputElement, Event], Checked]] = js.undefined
  
  var size: js.UndefOr[sm | md] = js.undefined
  
  var subtext: js.UndefOr[String] = js.undefined
}
object CheckboxProps {
  
  @scala.inline
  def apply(
    id: String,
    onChange: /* arg */ Checked & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxProps]
  }
  
  @scala.inline
  implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasErrorUndefined: Self = StObject.set(x, "hasError", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: /* arg */ Checked & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(
      value: /* arg */ Checked & (typings.gestalt.anon.Event[SyntheticEvent[HTMLInputElement, Event]]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
  }
}
