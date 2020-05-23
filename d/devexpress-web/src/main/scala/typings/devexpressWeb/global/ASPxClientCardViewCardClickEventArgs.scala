package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.CardClick event.
  */
@JSGlobal("ASPxClientCardViewCardClickEventArgs")
@js.native
class ASPxClientCardViewCardClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewCardClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewCardClickEventArgs class.
    * @param visibleIndex A zero-based integer index that identifies the clicked row.
    * @param htmlEvent An object that contains parameters associated with the event. This value is assigned to the ASPxClientCardViewCardClickEventArgs.htmlEvent property.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardClick event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets the processed card's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

