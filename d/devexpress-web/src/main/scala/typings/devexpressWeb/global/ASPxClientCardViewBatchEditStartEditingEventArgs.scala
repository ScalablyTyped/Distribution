package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditStartEditingEventArgs")
@js.native
class ASPxClientCardViewBatchEditStartEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditStartEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the card. This value is assigned to the ASPxClientCardViewBatchEditStartEditingEventArgs.visibleIndex property.
    * @param focusedColumn An ASPxClientCardViewColumn object that is the focused CardView column. This value is assigned to the ASPxClientCardViewBatchEditStartEditingEventArgs.focusedColumn property.
    * @param cardValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientCardViewBatchEditStartEditingEventArgs.cardValues property.
    */
  def this(
    visibleIndex: Double,
    focusedColumn: typings.devexpressWeb.ASPxClientCardViewColumn,
    cardValues: js.Any
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  override var cardValues: js.Any = js.native
  /**
    * Gets the CardView column that owns a cell that is about to be edited.
    */
  /* CompleteClass */
  override var focusedColumn: typings.devexpressWeb.ASPxClientCardViewColumn = js.native
  /**
    * Gets the visible index of the card whose cells are about to be edited.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

