package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTriggerBuilder extends js.Object {
  def create(): Trigger
  def onOpen(): DocumentTriggerBuilder
}

object DocumentTriggerBuilder {
  @scala.inline
  def apply(create: () => Trigger, onOpen: () => DocumentTriggerBuilder): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onOpen = js.Any.fromFunction0(onOpen))
  
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
}

