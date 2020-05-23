package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on groups.
  */
trait BootstrapClientAccordionGroupEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup
}

object BootstrapClientAccordionGroupEventArgs {
  @scala.inline
  def apply(group: BootstrapClientAccordionGroup): BootstrapClientAccordionGroupEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupEventArgs]
  }
}

