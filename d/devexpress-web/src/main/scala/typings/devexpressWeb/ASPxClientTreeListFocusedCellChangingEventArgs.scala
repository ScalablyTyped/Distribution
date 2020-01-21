package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientTreeListFocusedCellChangingEventArgs")
@js.native
class ASPxClientTreeListFocusedCellChangingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListFocusedCellChangingEventArgs class.
    * @param cellInfo An ASPxClientTreeListCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: ASPxClientTreeListCellInfo) = this()
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientTreeListCellInfo = js.native
}

