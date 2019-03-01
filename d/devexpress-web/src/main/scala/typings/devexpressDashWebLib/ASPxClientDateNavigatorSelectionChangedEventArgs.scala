package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigatorSelectionChangedEventArgs extends ASPxClientEventArgs {
  var selectedDates: js.Array[stdLib.Date]
}

object ASPxClientDateNavigatorSelectionChangedEventArgs {
  @scala.inline
  def apply(selectedDates: js.Array[stdLib.Date]): ASPxClientDateNavigatorSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectedDates")(selectedDates)
    __obj.asInstanceOf[ASPxClientDateNavigatorSelectionChangedEventArgs]
  }
}

