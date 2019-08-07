package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RecordClick event.
  */
@JSGlobal("ASPxClientVerticalGridRecordClickEventArgs")
@js.native
class ASPxClientVerticalGridRecordClickEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRecordClickEventArgs class.
    * @param visibleIndex A zero-based integer index that identifies the clicked record.
    * @param htmlEvent An object that contains parameters associated with the event. This value is assigned to the ASPxClientVerticalGridRecordClickEventArgs.htmlEvent property.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Provides access to the parameters associated with the ASPxClientVerticalGrid.RecordClick event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

