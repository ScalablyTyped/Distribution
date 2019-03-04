package typings
package devexpressDashWebLib

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
  var visibleIndex: scala.Double
}

object ASPxClientCardViewCardFocusingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Object, visibleIndex: scala.Double): ASPxClientCardViewCardFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewCardFocusingEventArgs]
  }
}

