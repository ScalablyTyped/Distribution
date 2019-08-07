package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a splitter control's cancelable client events concerning manipulations with a pane.
  */
@JSGlobal("ASPxClientSplitterPaneCancelEventArgs")
@js.native
class ASPxClientSplitterPaneCancelEventArgs protected () extends ASPxClientSplitterPaneEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSplitterPaneCancelEventArgs class.
    * @param pane A ASPxClientSplitterPane object representing a splitter pane related to the generated event.
    */
  def this(pane: ASPxClientSplitterPane) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}

