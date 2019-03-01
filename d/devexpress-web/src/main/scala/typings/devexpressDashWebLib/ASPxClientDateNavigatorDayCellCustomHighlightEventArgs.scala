package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigatorDayCellCustomHighlightEventArgs extends ASPxClientEventArgs {
  var appointments: js.Array[ASPxClientAppointment]
  var date: stdLib.Date
  var htmlElement: js.Object
}

object ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  @scala.inline
  def apply(appointments: js.Array[ASPxClientAppointment], date: stdLib.Date, htmlElement: js.Object): ASPxClientDateNavigatorDayCellCustomHighlightEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appointments")(appointments)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.asInstanceOf[ASPxClientDateNavigatorDayCellCustomHighlightEventArgs]
  }
}

