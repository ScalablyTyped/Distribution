package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FocusedCellChanging event.
  */
trait ASPxClientTreeListFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information on a cell currently being focused.
    * Value: A ASPxClientTreeListCellInfo object that is the cell information.
    */
  var cellInfo: ASPxClientTreeListCellInfo
}

object ASPxClientTreeListFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, cellInfo: ASPxClientTreeListCellInfo): ASPxClientTreeListFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cellInfo = cellInfo)
  
    __obj.asInstanceOf[ASPxClientTreeListFocusedCellChangingEventArgs]
  }
}

