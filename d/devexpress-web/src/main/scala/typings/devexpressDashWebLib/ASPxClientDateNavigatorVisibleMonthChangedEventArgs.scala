package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs extends ASPxClientEventArgs {
  var endDate: stdLib.Date
  var startDate: stdLib.Date
}

object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  @scala.inline
  def apply(endDate: stdLib.Date, startDate: stdLib.Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
}

