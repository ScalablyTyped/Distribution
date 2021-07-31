package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains methods allowing you to perform or cancel an operation.
  */
trait ASPxClientAppointmentOperation extends StObject {
  
  /**
    * Passes parameters to the corresponding callback function to accomplish the operation.
    */
  def Apply(): Unit
  
  /**
    * Cancels the operation.
    */
  def Cancel(): Unit
}
object ASPxClientAppointmentOperation {
  
  @scala.inline
  def apply(Apply: () => Unit, Cancel: () => Unit): ASPxClientAppointmentOperation = {
    val __obj = js.Dynamic.literal(Apply = js.Any.fromFunction0(Apply), Cancel = js.Any.fromFunction0(Cancel))
    __obj.asInstanceOf[ASPxClientAppointmentOperation]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentOperationMutableBuilder[Self <: ASPxClientAppointmentOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "Cancel", js.Any.fromFunction0(value))
  }
}
