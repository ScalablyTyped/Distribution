package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FocusedCellChanging event.
  */
trait ASPxClientGridViewFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    * Value: A ASPxClientGridViewCellInfo object that is the cell information.
    */
  var cellInfo: ASPxClientGridViewCellInfo
}

object ASPxClientGridViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientGridViewCellInfo): ASPxClientGridViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cellInfo = cellInfo)
  
    __obj.asInstanceOf[ASPxClientGridViewFocusedCellChangingEventArgs]
  }
}

