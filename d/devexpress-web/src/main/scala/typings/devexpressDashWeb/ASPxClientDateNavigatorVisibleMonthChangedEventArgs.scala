package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs extends ASPxClientEventArgs {
  var endDate: Date
  var startDate: Date
}

object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  @scala.inline
  def apply(endDate: Date, startDate: Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate, startDate = startDate)
  
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
}

