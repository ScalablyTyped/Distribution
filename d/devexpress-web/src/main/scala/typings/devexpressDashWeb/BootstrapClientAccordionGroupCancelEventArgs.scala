package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on accordion groups.
  */
trait BootstrapClientAccordionGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the group object related to the event.
    * Value: A BootstrapClientAccordionGroup object, manipulations on which forced the event to be raised.
    */
  var group: BootstrapClientAccordionGroup
}

object BootstrapClientAccordionGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, group: BootstrapClientAccordionGroup, processOnServer: Boolean): BootstrapClientAccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, group = group, processOnServer = processOnServer)
  
    __obj.asInstanceOf[BootstrapClientAccordionGroupCancelEventArgs]
  }
}

