package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
@js.native
trait ASPxClientVerticalGridRowExpandedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the expanded row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}

object ASPxClientVerticalGridRowExpandedEventArgs {
  @scala.inline
  def apply(row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandedEventArgs = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridRowExpandedEventArgsOps[Self <: ASPxClientVerticalGridRowExpandedEventArgs] (val x: Self) extends AnyVal {
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
    def setRow(value: ASPxClientVerticalGridRow): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

