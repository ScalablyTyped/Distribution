package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientGridViewBatchEditStartEditingEventArgs")
@js.native
class ASPxClientGridViewBatchEditStartEditingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditStartEditingEventArgs class.
    * @param visibleIndex An integer value that is the row's visible index.
    * @param focusedColumn An  object that is the focused row.
    * @param rowValues An object that provides the row values.
    * @param key An object that provides the row's key.
    */
  def this(visibleIndex: Double, focusedColumn: ASPxClientGridViewColumn, rowValues: js.Any, key: js.Any) = this()
  /**
    * Gets the grid column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientGridViewColumn = js.native
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var rowValues: js.Any = js.native
  /**
    * Gets the visible index of the row whose cells are about to be edited.
    */
  var visibleIndex: Double = js.native
}

