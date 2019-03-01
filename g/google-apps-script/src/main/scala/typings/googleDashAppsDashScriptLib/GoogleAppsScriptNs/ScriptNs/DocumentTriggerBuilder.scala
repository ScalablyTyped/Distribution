package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTriggerBuilder extends js.Object {
  def create(): Trigger
  def onOpen(): DocumentTriggerBuilder
}

object DocumentTriggerBuilder {
  @scala.inline
  def apply(create: js.Function0[Trigger], onOpen: js.Function0[DocumentTriggerBuilder]): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
}

