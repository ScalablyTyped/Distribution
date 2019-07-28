package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the RowExpandedChanged event.
  */
trait ASPxClientVerticalGridRowExpandedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the expanded row.
    * Value: An ASPxClientVerticalGridRow object that represents the expanded row.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridRowExpandedEventArgs {
  @scala.inline
  def apply(row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandedEventArgs = {
    val __obj = js.Dynamic.literal(row = row)
  
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandedEventArgs]
  }
}

