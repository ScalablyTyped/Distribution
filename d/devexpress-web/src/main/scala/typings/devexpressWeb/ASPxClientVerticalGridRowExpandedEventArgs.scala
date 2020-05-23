package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
trait ASPxClientVerticalGridRowExpandedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the expanded row.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridRowExpandedEventArgs {
  @scala.inline
  def apply(row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandedEventArgs = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandedEventArgs]
  }
}

