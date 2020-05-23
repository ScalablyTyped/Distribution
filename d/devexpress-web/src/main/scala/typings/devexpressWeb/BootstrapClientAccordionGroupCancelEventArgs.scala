package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on accordion groups.
  */
trait BootstrapClientAccordionGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup
}

object BootstrapClientAccordionGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, group: BootstrapClientAccordionGroup, processOnServer: Boolean): BootstrapClientAccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupCancelEventArgs]
  }
}

