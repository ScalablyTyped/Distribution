package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
trait ASPxClientDateNavigatorDayCellCustomHighlightEventArgs extends ASPxClientEventArgs {
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
}

