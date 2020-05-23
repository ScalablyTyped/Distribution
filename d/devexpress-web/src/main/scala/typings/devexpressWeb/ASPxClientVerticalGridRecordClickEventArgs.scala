package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RecordClick event.
  */
trait ASPxClientVerticalGridRecordClickEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientVerticalGrid.RecordClick event.
    */
  var htmlEvent: js.Any
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridRecordClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientVerticalGridRecordClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRecordClickEventArgs]
  }
}

