package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardRecovering event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardRecoveringEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardRecoveringEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewBatchEditCardRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardRecoveringEventArgs class.
    * @param visibleIndex An integer value specifying a card's visible index.
    * @param cardValues An object representing card values.
    */
  def this(visibleIndex: Double, cardValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  override var cardValues: js.Any = js.native
  /**
    * Gets the visible index of the card whose cells has been recovered.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

