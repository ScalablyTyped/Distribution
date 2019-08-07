package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.CardFocusing event.
  */
@JSGlobal("ASPxClientCardViewCardFocusingEventArgs")
@js.native
class ASPxClientCardViewCardFocusingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewCardFocusingEventArgs class.
    * @param visibleIndex A integer value specifying the card visible index.
    * @param htmlEvent An object specifying the HTML event.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardFocusing event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets the card visible index.
    */
  var visibleIndex: Double = js.native
}

