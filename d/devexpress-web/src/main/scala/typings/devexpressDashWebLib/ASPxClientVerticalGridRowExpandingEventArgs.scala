package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the RowExpandedChanging event.
  */
trait ASPxClientVerticalGridRowExpandingEventArgs extends ASPxClientVerticalGridRowExpandedEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true, if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
}

object ASPxClientVerticalGridRowExpandingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, row = row)
  
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandingEventArgs]
  }
}

