package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardDeleting event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardDeletingEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardDeletingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewBatchEditCardDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card visible index.
    * @param cardValues A hashtable that stores information about the processed card's cells.
    */
  def this(visibleIndex: Double, cardValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  override var cardValues: js.Any = js.native
  /**
    * Gets the processed card visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

