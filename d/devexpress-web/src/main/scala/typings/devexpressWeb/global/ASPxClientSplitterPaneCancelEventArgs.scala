package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a splitter control's cancelable client events concerning manipulations with a pane.
  */
@JSGlobal("ASPxClientSplitterPaneCancelEventArgs")
@js.native
class ASPxClientSplitterPaneCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSplitterPaneCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSplitterPaneCancelEventArgs class.
    * @param pane A ASPxClientSplitterPane object representing a splitter pane related to the generated event.
    */
  def this(pane: typings.devexpressWeb.ASPxClientSplitterPane) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the pane object related to the event.
    */
  /* CompleteClass */
  override var pane: typings.devexpressWeb.ASPxClientSplitterPane = js.native
}

