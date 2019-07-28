package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs

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
  def apply(create: () => Trigger, onFormSubmit: () => FormTriggerBuilder, onOpen: () => FormTriggerBuilder): FormTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onFormSubmit = js.Any.fromFunction0(onFormSubmit), onOpen = js.Any.fromFunction0(onOpen))
  
    __obj.asInstanceOf[FormTriggerBuilder]
  }
}

