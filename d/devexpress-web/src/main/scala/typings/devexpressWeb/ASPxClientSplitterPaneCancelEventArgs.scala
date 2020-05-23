package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a splitter control's cancelable client events concerning manipulations with a pane.
  */
trait ASPxClientSplitterPaneCancelEventArgs extends ASPxClientSplitterPaneEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientSplitterPaneCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, pane: ASPxClientSplitterPane): ASPxClientSplitterPaneCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitterPaneCancelEventArgs]
  }
}

