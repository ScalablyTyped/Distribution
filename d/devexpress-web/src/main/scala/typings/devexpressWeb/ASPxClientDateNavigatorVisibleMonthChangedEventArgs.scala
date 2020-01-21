package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
@JSGlobal("ASPxClientDateNavigatorVisibleMonthChangedEventArgs")
@js.native
class ASPxClientDateNavigatorVisibleMonthChangedEventArgs () extends ASPxClientEventArgs {
  /**
    * Returns the end date of the latest visible month.
    */
  var endDate: Date = js.native
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: Date = js.native
}

