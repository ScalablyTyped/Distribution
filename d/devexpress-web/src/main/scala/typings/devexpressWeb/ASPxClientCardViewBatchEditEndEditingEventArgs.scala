package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditEndEditingEventArgs")
@js.native
class ASPxClientCardViewBatchEditEndEditingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditEndEditingEventArgs class with the specified settings.
    * @param visibleIndex An integer value that specifies the visible index of the card. This value is assigned to the ASPxClientCardViewBatchEditEndEditingEventArgs.visibleIndex property.
    * @param cardValues A hashtable that stores information about editable cells. This value is assigned to the ASPxClientCardViewBatchEditEndEditingEventArgs.cardValues property.
    */
  def this(visibleIndex: Double, cardValues: js.Any) = this()
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var cardValues: js.Any = js.native
  /**
    * Gets the visible index of the card whose cells have been edited.
    */
  var visibleIndex: Double = js.native
}

