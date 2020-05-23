package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientGridViewBatchEditStartEditingEventArgs")
@js.native
class ASPxClientGridViewBatchEditStartEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditStartEditingEventArgs class.
    * @param visibleIndex An integer value that is the row's visible index.
    * @param focusedColumn An  object that is the focused row.
    * @param rowValues An object that provides the row values.
    * @param key An object that provides the row's key.
    */
  def this(
    visibleIndex: Double,
    focusedColumn: typings.devexpressWeb.ASPxClientGridViewColumn,
    rowValues: js.Any,
    key: js.Any
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the grid column that owns a cell that is about to be edited.
    */
  /* CompleteClass */
  override var focusedColumn: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
  /**
    * Gets the row's key.
    */
  /* CompleteClass */
  override var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  override var rowValues: js.Any = js.native
  /**
    * Gets the visible index of the row whose cells are about to be edited.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

