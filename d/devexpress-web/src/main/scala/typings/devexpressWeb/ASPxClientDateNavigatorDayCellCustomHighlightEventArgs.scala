package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
trait ASPxClientDateNavigatorDayCellCustomHighlightEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to the processed appointments.
    */
  var appointments: js.Array[ASPxClientAppointment]
  
  /**
    * Provides access to the date object of the processed cell.
    */
  var date: js.Date
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: Any
}
object ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  
  inline def apply(appointments: js.Array[ASPxClientAppointment], date: js.Date, htmlElement: Any): ASPxClientDateNavigatorDayCellCustomHighlightEventArgs = {
    val __obj = js.Dynamic.literal(appointments = appointments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorDayCellCustomHighlightEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDateNavigatorDayCellCustomHighlightEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAppointments(value: js.Array[ASPxClientAppointment]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
    
    inline def setAppointmentsVarargs(value: ASPxClientAppointment*): Self = StObject.set(x, "appointments", js.Array(value*))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
  }
}
