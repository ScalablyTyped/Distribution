package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigatorSelectionChangedEventArgs extends ASPxClientEventArgs {
  var selectedDates: js.Array[Date]
}

object ASPxClientDateNavigatorSelectionChangedEventArgs {
  @scala.inline
  def apply(selectedDates: js.Array[Date]): ASPxClientDateNavigatorSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDates = selectedDates)
  
    __obj.asInstanceOf[ASPxClientDateNavigatorSelectionChangedEventArgs]
  }
}

