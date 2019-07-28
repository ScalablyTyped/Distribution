package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
trait ASPxClientNavBarGroupClickEventArgs extends ASPxClientNavBarGroupCancelEventArgs {
  /**
    * Gets the HTML object that contains the processed group.
    * Value: An object representing a container for the group related to the event.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

object ASPxClientNavBarGroupClickEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    group: ASPxClientNavBarGroup,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: Boolean
  ): ASPxClientNavBarGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, group = group, htmlElement = htmlElement, htmlEvent = htmlEvent, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientNavBarGroupClickEventArgs]
  }
}

