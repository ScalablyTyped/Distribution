package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
@JSGlobal("ASPxClientVerticalGridRowExpandedEventArgs")
@js.native
class ASPxClientVerticalGridRowExpandedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowExpandedEventArgs class with specified settings.
    * @param row A ASPxClientVerticalGridRow object that uniquely identifies the expanded row. This value is assigned to the ASPxClientVerticalGridRowExpandedEventArgs.row property.
    */
  def this(row: ASPxClientVerticalGridRow) = this()
  /**
    * Gets the expanded row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}

