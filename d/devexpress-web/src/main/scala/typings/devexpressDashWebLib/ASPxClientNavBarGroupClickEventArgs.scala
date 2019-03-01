package typings
package devexpressDashWebLib

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
    cancel: scala.Boolean,
    group: ASPxClientNavBarGroup,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: scala.Boolean
  ): ASPxClientNavBarGroupClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientNavBarGroupClickEventArgs]
  }
}

