package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FocusedCellChanging event.
  */
trait ASPxClientVerticalGridFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    * Value: A ASPxClientVerticalGridCellInfo object that is the cell information.
    */
  var cellInfo: ASPxClientVerticalGridCellInfo
}

object ASPxClientVerticalGridFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientVerticalGridCellInfo): ASPxClientVerticalGridFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cellInfo = cellInfo)
  
    __obj.asInstanceOf[ASPxClientVerticalGridFocusedCellChangingEventArgs]
  }
}

