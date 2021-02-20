package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentsSelectionChanged event.
  */
@js.native
trait AppointmentsSelectionEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets identifiers of the selected appointments.
    */
  var appointmentIds: js.Array[String] = js.native
}
object AppointmentsSelectionEventArgs {
  
  @scala.inline
  def apply(appointmentIds: js.Array[String]): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentsSelectionEventArgsMutableBuilder[Self <: AppointmentsSelectionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentIds(value: js.Array[String]): Self = StObject.set(x, "appointmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentIdsVarargs(value: String*): Self = StObject.set(x, "appointmentIds", js.Array(value :_*))
  }
}
