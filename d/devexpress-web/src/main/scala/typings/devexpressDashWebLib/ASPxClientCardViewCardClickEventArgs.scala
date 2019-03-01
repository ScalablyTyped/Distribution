package typings
package devexpressDashWebLib

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
  var visibleIndex: scala.Double
}

object ASPxClientCardViewCardClickEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Object, visibleIndex: scala.Double): ASPxClientCardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientCardViewCardClickEventArgs]
  }
}

