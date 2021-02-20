package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDeletingEventArgs extends CancelEventArgs {
  
  val appointmentIds: js.Array[js.Object] = js.native
}
object AppointmentDeletingEventArgs {
  
  @scala.inline
  def apply(appointmentIds: js.Array[js.Object], cancel: Boolean, sender: Control): AppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDeletingEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentDeletingEventArgsMutableBuilder[Self <: AppointmentDeletingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentIds(value: js.Array[js.Object]): Self = StObject.set(x, "appointmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentIdsVarargs(value: js.Object*): Self = StObject.set(x, "appointmentIds", js.Array(value :_*))
  }
}
