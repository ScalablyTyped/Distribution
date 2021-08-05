package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentClickEventArgs
  extends StObject
     with EventArgs {
  
  val appointmentId: String
  
  val handled: Boolean
  
  val htmlElement: js.Object
}
object AppointmentClickEventArgs {
  
  inline def apply(appointmentId: String, handled: Boolean, htmlElement: js.Object, sender: Control): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
  
  extension [Self <: AppointmentClickEventArgs](x: Self) {
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHtmlElement(value: js.Object): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
  }
}
