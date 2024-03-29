package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for form triggers.
  */
trait FormTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onFormSubmit(): FormTriggerBuilder
  
  def onOpen(): FormTriggerBuilder
}
object FormTriggerBuilder {
  
  inline def apply(create: () => Trigger, onFormSubmit: () => FormTriggerBuilder, onOpen: () => FormTriggerBuilder): FormTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onFormSubmit = js.Any.fromFunction0(onFormSubmit), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[FormTriggerBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormTriggerBuilder] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setOnFormSubmit(value: () => FormTriggerBuilder): Self = StObject.set(x, "onFormSubmit", js.Any.fromFunction0(value))
    
    inline def setOnOpen(value: () => FormTriggerBuilder): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
  }
}
