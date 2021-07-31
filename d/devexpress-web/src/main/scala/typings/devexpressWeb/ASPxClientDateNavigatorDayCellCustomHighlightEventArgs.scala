package typings.devexpressWeb

import typings.std.Date
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
  var date: Date
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any
}
object ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  
  @scala.inline
  def apply(appointments: js.Array[ASPxClientAppointment], date: Date, htmlElement: js.Any): ASPxClientDateNavigatorDayCellCustomHighlightEventArgs = {
    val __obj = js.Dynamic.literal(appointments = appointments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorDayCellCustomHighlightEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDateNavigatorDayCellCustomHighlightEventArgsMutableBuilder[Self <: ASPxClientDateNavigatorDayCellCustomHighlightEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointments(value: js.Array[ASPxClientAppointment]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentsVarargs(value: ASPxClientAppointment*): Self = StObject.set(x, "appointments", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
  }
}
