package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCalendarCellClickEventArgs extends ASPxClientEventArgs {
  var date: Date
}

object ASPxClientCalendarCellClickEventArgs {
  @scala.inline
  def apply(date: Date): ASPxClientCalendarCellClickEventArgs = {
    val __obj = js.Dynamic.literal(date = date)
  
    __obj.asInstanceOf[ASPxClientCalendarCellClickEventArgs]
  }
}

