package typings.gestalt.mod

import typings.gestalt.anon.EventValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var name: js.UndefOr[String] = js.undefined
  
  def onChange(args: EventValue): Unit
  
  var switched: js.UndefOr[Boolean] = js.undefined
}
object SwitchProps {
  
  @scala.inline
  def apply(id: String, onChange: EventValue => Unit): SwitchProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsMutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnChange(value: EventValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitched(value: Boolean): Self = StObject.set(x, "switched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchedUndefined: Self = StObject.set(x, "switched", js.undefined)
  }
}
