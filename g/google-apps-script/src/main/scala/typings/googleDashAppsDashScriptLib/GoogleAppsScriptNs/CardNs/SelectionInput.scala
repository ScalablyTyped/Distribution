package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

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

