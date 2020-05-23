package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.FocusedCellChanging event.
  */
trait ASPxClientCardViewFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides information of a card's cell currently being focused.
    */
  var cellInfo: ASPxClientCardViewCellInfo
}

object ASPxClientCardViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientCardViewCellInfo): ASPxClientCardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewFocusedCellChangingEventArgs]
  }
}

