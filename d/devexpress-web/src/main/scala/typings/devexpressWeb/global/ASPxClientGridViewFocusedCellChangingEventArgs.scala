package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientGridViewFocusedCellChangingEventArgs")
@js.native
class ASPxClientGridViewFocusedCellChangingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientGridViewCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typings.devexpressWeb.ASPxClientGridViewCellInfo) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  override var cellInfo: typings.devexpressWeb.ASPxClientGridViewCellInfo = js.native
}

