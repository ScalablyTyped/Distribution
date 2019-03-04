package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Switch extends js.Object {
  def setFieldName(fieldName: java.lang.String): Switch
  def setOnChangeAction(action: Action): Switch
  def setSelected(selected: scala.Boolean): Switch
  def setValue(value: java.lang.String): Switch
}

object Switch {
  @scala.inline
  def apply(
    setFieldName: js.Function1[java.lang.String, Switch],
    setOnChangeAction: js.Function1[Action, Switch],
    setSelected: js.Function1[scala.Boolean, Switch],
    setValue: js.Function1[java.lang.String, Switch]
  ): Switch = {
    val __obj = js.Dynamic.literal(setFieldName = setFieldName, setOnChangeAction = setOnChangeAction, setSelected = setSelected, setValue = setValue)
  
    __obj.asInstanceOf[Switch]
  }
}

