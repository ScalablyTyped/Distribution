package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on groups.
  */
trait BootstrapClientAccordionGroupEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the group object related to the event.
    * Value: A BootstrapClientAccordionGroup object, manipulations on which forced the event to be raised.
    */
  var group: BootstrapClientAccordionGroup
}

object BootstrapClientAccordionGroupEventArgs {
  @scala.inline
  def apply(group: BootstrapClientAccordionGroup): BootstrapClientAccordionGroupEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[BootstrapClientAccordionGroupEventArgs]
  }
}

