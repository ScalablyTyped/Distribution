package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInput extends js.Object {
  def addItem(text: js.Object, value: js.Object, selected: scala.Boolean): SelectionInput
  def setFieldName(fieldName: java.lang.String): SelectionInput
  def setOnChangeAction(action: Action): SelectionInput
  def setTitle(title: java.lang.String): SelectionInput
  def setType(`type`: SelectionInputType): SelectionInput
}

object SelectionInput {
  @scala.inline
  def apply(
    addItem: js.Function3[js.Object, js.Object, scala.Boolean, SelectionInput],
    setFieldName: js.Function1[java.lang.String, SelectionInput],
    setOnChangeAction: js.Function1[Action, SelectionInput],
    setTitle: js.Function1[java.lang.String, SelectionInput],
    setType: js.Function1[SelectionInputType, SelectionInput]
  ): SelectionInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(addItem)
    __obj.updateDynamic("setFieldName")(setFieldName)
    __obj.updateDynamic("setOnChangeAction")(setOnChangeAction)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setType")(setType)
    __obj.asInstanceOf[SelectionInput]
  }
}

