package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
@js.native
trait ASPxClientDateNavigatorDayCellCustomHighlightEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to the processed appointments.
    */
  var appointments: js.Array[ASPxClientAppointment] = js.native
  
  /**
    * Provides access to the date object of the processed cell.
    */
  var date: Date = js.native
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any = js.native
}
object ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  
  @scala.inline
  def apply(appointments: js.Array[ASPxClientAppointment], date: Date, htmlElement: js.Any): ASPxClientDateNavigatorDayCellCustomHighlightEventArgs = {
    val __obj = js.Dynamic.literal(appointments = appointments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorDayCellCustomHighlightEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDateNavigatorDayCellCustomHighlightEventArgsOps[Self <: ASPxClientDateNavigatorDayCellCustomHighlightEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointmentsVarargs(value: ASPxClientAppointment*): Self = this.set("appointments", js.Array(value :_*))
    
    @scala.inline
    def setAppointments(value: js.Array[ASPxClientAppointment]): Self = this.set("appointments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
  }
}
