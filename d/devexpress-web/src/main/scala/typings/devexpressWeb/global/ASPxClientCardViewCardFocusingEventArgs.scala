package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.CardFocusing event.
  */
@JSGlobal("ASPxClientCardViewCardFocusingEventArgs")
@js.native
class ASPxClientCardViewCardFocusingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewCardFocusingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewCardFocusingEventArgs class.
    * @param visibleIndex A integer value specifying the card visible index.
    * @param htmlEvent An object specifying the HTML event.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardFocusing event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets the card visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

