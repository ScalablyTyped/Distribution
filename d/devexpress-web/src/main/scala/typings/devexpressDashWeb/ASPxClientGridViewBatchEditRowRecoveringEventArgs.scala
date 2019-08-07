package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowRecovering event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowRecoveringEventArgs")
@js.native
class ASPxClientGridViewBatchEditRowRecoveringEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowRecoveringEventArgs class.
    * @param visibleIndex An integer value that specifies the row's visible index.
    * @param rowValues An object that provides row values.
    * @param key An object that is the row's key.
    */
  def this(visibleIndex: Double, rowValues: js.Any, key: js.Any) = this()
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var rowValues: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

