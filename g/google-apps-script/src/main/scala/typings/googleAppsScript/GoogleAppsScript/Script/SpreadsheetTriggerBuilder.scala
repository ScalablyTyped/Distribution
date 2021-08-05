package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for spreadsheet triggers.
  */
trait SpreadsheetTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onChange(): SpreadsheetTriggerBuilder
  
  def onEdit(): SpreadsheetTriggerBuilder
  
  def onFormSubmit(): SpreadsheetTriggerBuilder
  
  def onOpen(): SpreadsheetTriggerBuilder
}
object SpreadsheetTriggerBuilder {
  
  inline def apply(
    create: () => Trigger,
    onChange: () => SpreadsheetTriggerBuilder,
    onEdit: () => SpreadsheetTriggerBuilder,
    onFormSubmit: () => SpreadsheetTriggerBuilder,
    onOpen: () => SpreadsheetTriggerBuilder
  ): SpreadsheetTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onChange = js.Any.fromFunction0(onChange), onEdit = js.Any.fromFunction0(onEdit), onFormSubmit = js.Any.fromFunction0(onFormSubmit), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[SpreadsheetTriggerBuilder]
  }
  
  extension [Self <: SpreadsheetTriggerBuilder](x: Self) {
    
    inline def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setOnChange(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnEdit(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onEdit", js.Any.fromFunction0(value))
    
    inline def setOnFormSubmit(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onFormSubmit", js.Any.fromFunction0(value))
    
    inline def setOnOpen(value: () => SpreadsheetTriggerBuilder): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
  }
}
