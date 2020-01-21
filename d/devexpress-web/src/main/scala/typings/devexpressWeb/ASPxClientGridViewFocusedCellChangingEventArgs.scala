package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientGridViewFocusedCellChangingEventArgs")
@js.native
class ASPxClientGridViewFocusedCellChangingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientGridViewCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: ASPxClientGridViewCellInfo) = this()
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientGridViewCellInfo = js.native
}

