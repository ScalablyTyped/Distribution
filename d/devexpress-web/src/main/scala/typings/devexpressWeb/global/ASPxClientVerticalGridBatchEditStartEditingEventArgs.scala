package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditStartEditingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditStartEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditStartEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the record. This value is assigned to the ASPxClientVerticalGridBatchEditRecordValidatingEventArgs.visibleIndex property.
    * @param focusedRow An ASPxClientVerticalGridRow object that is the focused grid row. This value is assigned to the ASPxClientVerticalGridBatchEditStartEditingEventArgs.focusedRow property.
    * @param recordValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientVerticalGridBatchEditStartEditingEventArgs.recordValues property.
    */
  def this(
    visibleIndex: Double,
    focusedRow: typings.devexpressWeb.ASPxClientVerticalGridRow,
    recordValues: js.Any
  ) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the grid row that owns a cell that is about to be edited.
    */
  /* CompleteClass */
  var focusedRow: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  var recordValues: js.Any = js.native
  
  /**
    * Gets the visible index of the record whose cells are about to be edited.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
