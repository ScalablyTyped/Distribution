package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for spreadsheet triggers.
  */
@js.native
trait SpreadsheetTriggerBuilder extends StObject {
  
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
  implicit class SpreadsheetTriggerBuilderMutableBuilder[Self <: SpreadsheetTriggerBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEdit(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFormSubmit(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onFormSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpen(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
  }
}
