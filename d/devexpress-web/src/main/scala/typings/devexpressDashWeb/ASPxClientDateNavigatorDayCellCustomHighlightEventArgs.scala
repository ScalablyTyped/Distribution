package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
@JSGlobal("ASPxClientDateNavigatorDayCellCustomHighlightEventArgs")
@js.native
class ASPxClientDateNavigatorDayCellCustomHighlightEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDateNavigatorDayCellCustomHighlightEventArgs class.
    * @param htmlElement An object representing the HTML element.
    * @param date A DateTime object that represents the highlighted date.
    * @param appointments An array of ASPxClientAppointment objects that the highlighted day cell contains.
    */
  def this(htmlElement: js.Any, date: Date, appointments: js.Array[ASPxClientAppointment]) = this()
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

