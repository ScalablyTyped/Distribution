package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on groups.
  */
@JSGlobal("BootstrapClientAccordionGroupEventArgs")
@js.native
class BootstrapClientAccordionGroupEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientAccordionGroupEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionGroupEventArgs type with the specified value.
    * @param group An BootstrapAccordionGroup object representing the group related to the event.
    */
  def this(group: typings.devexpressWeb.BootstrapClientAccordionGroup) = this()
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  override var group: typings.devexpressWeb.BootstrapClientAccordionGroup = js.native
}

