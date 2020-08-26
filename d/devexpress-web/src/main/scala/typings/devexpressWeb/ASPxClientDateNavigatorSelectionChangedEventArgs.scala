package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.SelectionChanged event.
  */
@js.native
trait ASPxClientDateNavigatorSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the selected dates related to the event.
    */
  var selectedDates: js.Array[Date] = js.native
}

object ASPxClientDateNavigatorSelectionChangedEventArgs {
  @scala.inline
  def apply(selectedDates: js.Array[Date]): ASPxClientDateNavigatorSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorSelectionChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDateNavigatorSelectionChangedEventArgsOps[Self <: ASPxClientDateNavigatorSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectedDatesVarargs(value: Date*): Self = this.set("selectedDates", js.Array(value :_*))
    @scala.inline
    def setSelectedDates(value: js.Array[Date]): Self = this.set("selectedDates", value.asInstanceOf[js.Any])
  }
  
}

