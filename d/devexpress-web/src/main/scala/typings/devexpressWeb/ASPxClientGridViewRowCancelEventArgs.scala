package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
  */
trait ASPxClientGridViewRowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewRowCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientGridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewRowCancelEventArgs]
  }
}

