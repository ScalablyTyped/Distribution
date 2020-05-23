package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
trait ASPxClientGridViewRowFocusingEventArgs extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  var htmlEvent: js.Any
}

object ASPxClientGridViewRowFocusingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientGridViewRowFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowFocusingEventArgs]
  }
}

