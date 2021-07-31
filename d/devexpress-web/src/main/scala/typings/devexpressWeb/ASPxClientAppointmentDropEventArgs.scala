package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
trait ASPxClientAppointmentDropEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides information about dropped appointments.
    */
  var dragInformation: js.Array[ASPxClientAppointmentDragInfo]
  
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean
  
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  var operation: ASPxClientAppointmentOperation
}
object ASPxClientAppointmentDropEventArgs {
  
  @scala.inline
  def apply(
    dragInformation: js.Array[ASPxClientAppointmentDragInfo],
    handled: Boolean,
    operation: ASPxClientAppointmentOperation
  ): ASPxClientAppointmentDropEventArgs = {
    val __obj = js.Dynamic.literal(dragInformation = dragInformation.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDropEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentDropEventArgsMutableBuilder[Self <: ASPxClientAppointmentDropEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragInformation(value: js.Array[ASPxClientAppointmentDragInfo]): Self = StObject.set(x, "dragInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragInformationVarargs(value: ASPxClientAppointmentDragInfo*): Self = StObject.set(x, "dragInformation", js.Array(value :_*))
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: ASPxClientAppointmentOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
