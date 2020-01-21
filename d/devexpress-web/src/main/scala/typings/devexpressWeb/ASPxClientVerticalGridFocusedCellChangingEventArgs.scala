package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientVerticalGridFocusedCellChangingEventArgs")
@js.native
class ASPxClientVerticalGridFocusedCellChangingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientVerticalGridCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: ASPxClientVerticalGridCellInfo) = this()
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientVerticalGridCellInfo = js.native
}

