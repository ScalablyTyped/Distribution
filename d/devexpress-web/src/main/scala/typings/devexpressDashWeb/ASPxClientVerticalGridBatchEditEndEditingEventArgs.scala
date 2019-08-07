package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditEndEditingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditEndEditingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditEndEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the record. This value is assigned to the ASPxClientVerticalGridBatchEditEndEditingEventArgs.visibleIndex property.
    * @param recordValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientVerticalGridBatchEditEndEditingEventArgs.recordValues property.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the visible index of the record whose cells have been edited.
    */
  var visibleIndex: Double = js.native
}

