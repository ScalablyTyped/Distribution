package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UI element that supports being toggled on or off. This can only be used within a KeyValue widget.
  *
  *     var switchKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Switch key value widget label")
  *         .setContent("This is a key value widget with a switch on the right")
  *         .setSwitch(CardService.newSwitch()
  *             .setFieldName("form_input_switch_key")
  *             .setValue("form_input_switch_value")
  *             .setOnChangeAction(CardService.newAction()
  *                 .setFunctionName("handleSwitchChange")));
  */
@js.native
trait Switch extends js.Object {
  def setFieldName(fieldName: String): Switch = js.native
  def setOnChangeAction(action: Action): Switch = js.native
  def setSelected(selected: Boolean): Switch = js.native
  def setValue(value: String): Switch = js.native
}

object Switch {
  @scala.inline
  def apply(
    setFieldName: String => Switch,
    setOnChangeAction: Action => Switch,
    setSelected: Boolean => Switch,
    setValue: String => Switch
  ): Switch = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSelected = js.Any.fromFunction1(setSelected), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Switch]
  }
  @scala.inline
  implicit class SwitchOps[Self <: Switch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetFieldName(value: String => Switch): Self = this.set("setFieldName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOnChangeAction(value: Action => Switch): Self = this.set("setOnChangeAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSelected(value: Boolean => Switch): Self = this.set("setSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: String => Switch): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
  
}

