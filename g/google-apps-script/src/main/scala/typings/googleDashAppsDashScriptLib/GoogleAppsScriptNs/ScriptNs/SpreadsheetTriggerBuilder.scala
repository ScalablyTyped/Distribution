package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTriggerBuilder extends js.Object {
  def create(): Trigger
  def onChange(): SpreadsheetTriggerBuilder
  def onEdit(): SpreadsheetTriggerBuilder
  def onFormSubmit(): SpreadsheetTriggerBuilder
  def onOpen(): SpreadsheetTriggerBuilder
}

object SpreadsheetTriggerBuilder {
  @scala.inline
  def apply(
    create: js.Function0[Trigger],
    onChange: js.Function0[SpreadsheetTriggerBuilder],
    onEdit: js.Function0[SpreadsheetTriggerBuilder],
    onFormSubmit: js.Function0[SpreadsheetTriggerBuilder],
    onOpen: js.Function0[SpreadsheetTriggerBuilder]
  ): SpreadsheetTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onEdit")(onEdit)
    __obj.updateDynamic("onFormSubmit")(onFormSubmit)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.asInstanceOf[SpreadsheetTriggerBuilder]
  }
}

