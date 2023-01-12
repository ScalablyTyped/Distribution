package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for document triggers.
  */
trait DocumentTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onOpen(): DocumentTriggerBuilder
}
object DocumentTriggerBuilder {
  
  inline def apply(create: () => Trigger, onOpen: () => DocumentTriggerBuilder): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentTriggerBuilder] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setOnOpen(value: () => DocumentTriggerBuilder): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
  }
}
