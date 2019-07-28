package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FocusedCellChanging event.
  */
trait ASPxClientCardViewFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information of a card's cell currently being focused.
    * Value: A ASPxClientCardViewCellInfo object that provides information about the card's cell.
    */
  var cellInfo: ASPxClientCardViewCellInfo
}

object ASPxClientCardViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientCardViewCellInfo): ASPxClientCardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cellInfo = cellInfo)
  
    __obj.asInstanceOf[ASPxClientCardViewFocusedCellChangingEventArgs]
  }
}

