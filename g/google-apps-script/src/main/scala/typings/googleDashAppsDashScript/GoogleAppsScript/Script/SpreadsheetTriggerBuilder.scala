package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for spreadsheet triggers.
  */
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
    create: () => Trigger,
    onChange: () => SpreadsheetTriggerBuilder,
    onEdit: () => SpreadsheetTriggerBuilder,
    onFormSubmit: () => SpreadsheetTriggerBuilder,
    onOpen: () => SpreadsheetTriggerBuilder
  ): SpreadsheetTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onChange = js.Any.fromFunction0(onChange), onEdit = js.Any.fromFunction0(onEdit), onFormSubmit = js.Any.fromFunction0(onFormSubmit), onOpen = js.Any.fromFunction0(onOpen))
  
    __obj.asInstanceOf[SpreadsheetTriggerBuilder]
  }
}

