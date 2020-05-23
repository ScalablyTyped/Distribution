package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
trait ASPxClientNavBarGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup
}

object ASPxClientNavBarGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, group: ASPxClientNavBarGroup, processOnServer: Boolean): ASPxClientNavBarGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupCancelEventArgs]
  }
}

