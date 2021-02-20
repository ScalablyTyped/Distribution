package typings.gestalt.mod

import typings.gestalt.anon.Value
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectListProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var helperText: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def onChange(args: Value): Unit = js.native
  
  var options: js.Array[typings.gestalt.anon.Label] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[md | lg] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SelectListProps {
  
  @scala.inline
  def apply(id: String, onChange: Value => Unit, options: js.Array[typings.gestalt.anon.Label]): SelectListProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListProps]
  }
  
  @scala.inline
  implicit class SelectListPropsMutableBuilder[Self <: SelectListProps] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: js.Array[typings.gestalt.anon.Label]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: typings.gestalt.anon.Label*): Self = StObject.set(x, "options", js.Array(value :_*))
    
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
