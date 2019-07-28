package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CardFocusing event.
  */
trait ASPxClientCardViewCardFocusingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to the parameters associated with the CardFocusing event.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
  /**
    * Gets the card visible index.
    * Value: An integer value specifying the visible index.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewCardFocusingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Object, visibleIndex: Double): ASPxClientCardViewCardFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewCardFocusingEventArgs]
  }
}

