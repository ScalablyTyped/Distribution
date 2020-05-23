package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the end date of the latest visible month.
    */
  var endDate: Date
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: Date
}

object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  @scala.inline
  def apply(endDate: Date, startDate: Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
}

