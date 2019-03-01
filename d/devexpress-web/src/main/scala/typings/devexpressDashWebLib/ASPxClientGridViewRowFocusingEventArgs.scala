package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the RowFocusing event.
  */
trait ASPxClientGridViewRowFocusingEventArgs extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Provides access to the parameters associated with the RowFocusing event.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
}

object ASPxClientGridViewRowFocusingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Object, visibleIndex: scala.Double): ASPxClientGridViewRowFocusingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientGridViewRowFocusingEventArgs]
  }
}

