package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a splitter control's cancelable client events concerning manipulations with a pane.
  */
trait ASPxClientSplitterPaneCancelEventArgs extends ASPxClientSplitterPaneEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
}

object ASPxClientSplitterPaneCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, pane: ASPxClientSplitterPane): ASPxClientSplitterPaneCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, pane = pane)
  
    __obj.asInstanceOf[ASPxClientSplitterPaneCancelEventArgs]
  }
}

