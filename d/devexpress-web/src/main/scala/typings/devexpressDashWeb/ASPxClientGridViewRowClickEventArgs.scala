package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the RowClick event.
  */
trait ASPxClientGridViewRowClickEventArgs extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Provides access to the parameters associated with the RowClick event.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
}

object ASPxClientGridViewRowClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Object, visibleIndex: Double): ASPxClientGridViewRowClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewRowClickEventArgs]
  }
}

