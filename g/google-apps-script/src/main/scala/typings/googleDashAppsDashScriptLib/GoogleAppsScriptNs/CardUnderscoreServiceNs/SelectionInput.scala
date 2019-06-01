package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInput extends js.Object {
  def addItem(text: js.Any, value: js.Any, selected: scala.Boolean): SelectionInput
  def setFieldName(fieldName: java.lang.String): SelectionInput
  def setOnChangeAction(action: Action): SelectionInput
  def setTitle(title: java.lang.String): SelectionInput
  def setType(`type`: SelectionInputType): SelectionInput
}

object SelectionInput {
  @scala.inline
  def apply(
    addItem: (js.Any, js.Any, scala.Boolean) => SelectionInput,
    setFieldName: java.lang.String => SelectionInput,
    setOnChangeAction: Action => SelectionInput,
    setTitle: java.lang.String => SelectionInput,
    setType: SelectionInputType => SelectionInput
  ): SelectionInput = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction3(addItem), setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setTitle = js.Any.fromFunction1(setTitle), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[SelectionInput]
  }
}

