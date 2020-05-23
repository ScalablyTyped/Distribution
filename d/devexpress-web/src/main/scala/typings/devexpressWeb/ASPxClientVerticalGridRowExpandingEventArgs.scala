package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanging event.
  */
trait ASPxClientVerticalGridRowExpandingEventArgs extends ASPxClientVerticalGridRowExpandedEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientVerticalGridRowExpandingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandingEventArgs]
  }
}

