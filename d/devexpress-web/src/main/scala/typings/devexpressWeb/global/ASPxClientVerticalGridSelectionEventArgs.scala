package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.SelectionChanged event.
  */
@JSGlobal("ASPxClientVerticalGridSelectionEventArgs")
@js.native
class ASPxClientVerticalGridSelectionEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridSelectionEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridSelectionEventArgs class.
    * @param visibleIndex An integer value that specifies the visible index of the record whose selected state has been changed. This value is assigned to the ASPxClientVerticalGridSelectionEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets whether all records displayed within a page have been selected or unselected.
    */
  /* CompleteClass */
  override var isAllRecordsOnPage: Boolean = js.native
  /**
    * Gets whether a selection has been changed on the server.
    */
  /* CompleteClass */
  override var isChangedOnServer: Boolean = js.native
  /**
    * Gets whether the record has been selected.
    */
  /* CompleteClass */
  override var isSelected: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
  /**
    * Gets the visible index of the record whose selected state has been changed.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

