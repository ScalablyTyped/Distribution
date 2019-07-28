package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CardClick event.
  */
trait ASPxClientCardViewCardClickEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to the parameters associated with the CardClick event.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
  /**
    * Gets the processed card's visible index.
    * Value: An integer zero-based index that identifies the processed record.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewCardClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Object, visibleIndex: Double): ASPxClientCardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewCardClickEventArgs]
  }
}

