package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigatorDayCellCustomHighlightEventArgs extends ASPxClientEventArgs {
  var appointments: js.Array[ASPxClientAppointment]
  var date: Date
  var htmlElement: js.Object
}

object ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  @scala.inline
  def apply(appointments: js.Array[ASPxClientAppointment], date: Date, htmlElement: js.Object): ASPxClientDateNavigatorDayCellCustomHighlightEventArgs = {
    val __obj = js.Dynamic.literal(appointments = appointments, date = date, htmlElement = htmlElement)
  
    __obj.asInstanceOf[ASPxClientDateNavigatorDayCellCustomHighlightEventArgs]
  }
}

