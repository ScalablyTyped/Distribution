package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanging event.
  */
@JSGlobal("ASPxClientVerticalGridRowExpandingEventArgs")
@js.native
class ASPxClientVerticalGridRowExpandingEventArgs protected () extends ASPxClientVerticalGridRowExpandedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowExpandingEventArgs class with the specified row.
    * @param row An ASPxClientVerticalGridRowobject that represents the row to expand.
    */
  def this(row: ASPxClientVerticalGridRow) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}

