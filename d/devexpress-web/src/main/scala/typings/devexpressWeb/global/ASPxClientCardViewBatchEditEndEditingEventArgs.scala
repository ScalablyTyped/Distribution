package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditEndEditingEventArgs")
@js.native
class ASPxClientCardViewBatchEditEndEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditEndEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the card. This value is assigned to the ASPxClientCardViewBatchEditEndEditingEventArgs.visibleIndex property.
    * @param cardValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientCardViewBatchEditEndEditingEventArgs.cardValues property.
    */
  def this(visibleIndex: Double, cardValues: js.Any) = this()
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
    * Gets the visible index of the card whose cells have been edited.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

