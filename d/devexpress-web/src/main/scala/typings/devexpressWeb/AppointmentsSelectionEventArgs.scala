package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentsSelectionChanged event.
  */
trait AppointmentsSelectionEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets identifiers of the selected appointments.
    */
  var appointmentIds: js.Array[String]
}
object AppointmentsSelectionEventArgs {
  
  inline def apply(appointmentIds: js.Array[String]): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentsSelectionEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAppointmentIds(value: js.Array[String]): Self = StObject.set(x, "appointmentIds", value.asInstanceOf[js.Any])
    
    inline def setAppointmentIdsVarargs(value: String*): Self = StObject.set(x, "appointmentIds", js.Array(value*))
  }
}
