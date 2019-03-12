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
    setFieldName: java.lang.String => Switch,
    setOnChangeAction: Action => Switch,
    setSelected: scala.Boolean => Switch,
    setValue: java.lang.String => Switch
  ): Switch = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSelected = js.Any.fromFunction1(setSelected), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[Switch]
  }
}

