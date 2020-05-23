package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.SelectionChanged event.
  */
trait ASPxClientDateNavigatorSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the selected dates related to the event.
    */
  var selectedDates: js.Array[Date]
}

object ASPxClientDateNavigatorSelectionChangedEventArgs {
  @scala.inline
  def apply(selectedDates: js.Array[Date]): ASPxClientDateNavigatorSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorSelectionChangedEventArgs]
  }
}

