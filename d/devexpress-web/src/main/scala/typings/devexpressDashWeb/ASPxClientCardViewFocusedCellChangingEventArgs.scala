package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientCardViewFocusedCellChangingEventArgs")
@js.native
class ASPxClientCardViewFocusedCellChangingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientCardViewCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: ASPxClientCardViewCellInfo) = this()
  /**
    * Provides information of a card's cell currently being focused.
    */
  var cellInfo: ASPxClientCardViewCellInfo = js.native
}

