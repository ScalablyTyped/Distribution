package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for spreadsheet triggers.
  */
@js.native
trait SpreadsheetTriggerBuilder extends js.Object {
  
  def create(): Trigger = js.native
  
  def onChange(): SpreadsheetTriggerBuilder = js.native
  
  def onEdit(): SpreadsheetTriggerBuilder = js.native
  
  def onFormSubmit(): SpreadsheetTriggerBuilder = js.native
  
  def onOpen(): SpreadsheetTriggerBuilder = js.native
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
  
  @scala.inline
  implicit class SpreadsheetTriggerBuilderOps[Self <: SpreadsheetTriggerBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => Trigger): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => SpreadsheetTriggerBuilder): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEdit(value: () => SpreadsheetTriggerBuilder): Self = this.set("onEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFormSubmit(value: () => SpreadsheetTriggerBuilder): Self = this.set("onFormSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpen(value: () => SpreadsheetTriggerBuilder): Self = this.set("onOpen", js.Any.fromFunction0(value))
  }
}
