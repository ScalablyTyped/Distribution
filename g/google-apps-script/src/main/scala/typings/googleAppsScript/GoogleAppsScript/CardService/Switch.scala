package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A UI element that supports being toggled on or off. This can only be used within a KeyValue widget.
  *
  *     var switchKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Switch key value widget label")
  *         .setContent("This is a key value widget with a switch on the right")
  *         .setSwitch(CardService.newSwitch()
  *             .setFieldName("form_input_switch_key")
  *             .setValue("form_input_switch_value")
  *             .setControlType(CardService.SwitchControlType.SWITCH)
  *             .setOnChangeAction(CardService.newAction()
  *                 .setFunctionName("handleSwitchChange")));
  */
@js.native
trait Switch extends StObject {
  
  def setControlType(`type`: SwitchControlType): Switch = js.native
  
  def setFieldName(fieldName: String): Switch = js.native
  
  def setOnChangeAction(action: Action): Switch = js.native
  
  def setSelected(selected: Boolean): Switch = js.native
  
  def setValue(value: String): Switch = js.native
}
object Switch {
  
  @scala.inline
  def apply(
    setControlType: SwitchControlType => Switch,
    setFieldName: String => Switch,
    setOnChangeAction: Action => Switch,
    setSelected: Boolean => Switch,
    setValue: String => Switch
  ): Switch = {
    val __obj = js.Dynamic.literal(setControlType = js.Any.fromFunction1(setControlType), setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSelected = js.Any.fromFunction1(setSelected), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Switch]
  }
  
  @scala.inline
  implicit class SwitchMutableBuilder[Self <: Switch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetControlType(value: SwitchControlType => Switch): Self = StObject.set(x, "setControlType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldName(value: String => Switch): Self = StObject.set(x, "setFieldName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnChangeAction(value: Action => Switch): Self = StObject.set(x, "setOnChangeAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelected(value: Boolean => Switch): Self = StObject.set(x, "setSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => Switch): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
