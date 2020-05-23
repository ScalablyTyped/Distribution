package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.CardClick event.
  */
trait ASPxClientCardViewCardClickEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardClick event.
    */
  var htmlEvent: js.Any
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewCardClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientCardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCardClickEventArgs]
  }
}

