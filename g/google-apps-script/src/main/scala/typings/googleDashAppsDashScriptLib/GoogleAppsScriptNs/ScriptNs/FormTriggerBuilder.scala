package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormTriggerBuilder extends js.Object {
  def create(): Trigger
  def onFormSubmit(): FormTriggerBuilder
  def onOpen(): FormTriggerBuilder
}

object FormTriggerBuilder {
  @scala.inline
  def apply(
    create: js.Function0[Trigger],
    onFormSubmit: js.Function0[FormTriggerBuilder],
    onOpen: js.Function0[FormTriggerBuilder]
  ): FormTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = create, onFormSubmit = onFormSubmit, onOpen = onOpen)
  
    __obj.asInstanceOf[FormTriggerBuilder]
  }
}

