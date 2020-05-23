package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
trait ASPxClientVerticalGridFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientVerticalGridCellInfo
}

object ASPxClientVerticalGridFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientVerticalGridCellInfo): ASPxClientVerticalGridFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridFocusedCellChangingEventArgs]
  }
}

