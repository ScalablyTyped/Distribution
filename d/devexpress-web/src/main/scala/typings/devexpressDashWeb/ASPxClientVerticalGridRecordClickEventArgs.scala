package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the RecordClick event.
  */
trait ASPxClientVerticalGridRecordClickEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to the parameters associated with the RecordClick event.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
  /**
    * Gets the processed record's visible index.
    * Value: An integer zero-based index that identifies the processed record.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridRecordClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Object, visibleIndex: Double): ASPxClientVerticalGridRecordClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientVerticalGridRecordClickEventArgs]
  }
}

