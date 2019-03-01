package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCalendarCellClickEventArgs extends ASPxClientEventArgs {
  var date: stdLib.Date
}

object ASPxClientCalendarCellClickEventArgs {
  @scala.inline
  def apply(date: stdLib.Date): ASPxClientCalendarCellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.asInstanceOf[ASPxClientCalendarCellClickEventArgs]
  }
}

