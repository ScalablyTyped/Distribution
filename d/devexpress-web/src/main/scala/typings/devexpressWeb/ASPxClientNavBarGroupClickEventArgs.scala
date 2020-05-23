package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
trait ASPxClientNavBarGroupClickEventArgs extends ASPxClientNavBarGroupCancelEventArgs {
  /**
    * Gets the HTML object that contains the processed group.
    */
  var htmlElement: js.Any
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
}

object ASPxClientNavBarGroupClickEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    group: ASPxClientNavBarGroup,
    htmlElement: js.Any,
    htmlEvent: js.Any,
    processOnServer: Boolean
  ): ASPxClientNavBarGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupClickEventArgs]
  }
}

