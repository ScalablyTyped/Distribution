package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on groups.
  */
@JSGlobal("BootstrapClientAccordionGroupEventArgs")
@js.native
class BootstrapClientAccordionGroupEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionGroupEventArgs type with the specified value.
    * @param group An BootstrapAccordionGroup object representing the group related to the event.
    */
  def this(group: BootstrapClientAccordionGroup) = this()
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup = js.native
}

