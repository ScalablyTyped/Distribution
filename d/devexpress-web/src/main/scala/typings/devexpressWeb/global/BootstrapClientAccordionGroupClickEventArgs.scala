package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's group headers.
  */
@JSGlobal("BootstrapClientAccordionGroupClickEventArgs")
@js.native
class BootstrapClientAccordionGroupClickEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientAccordionGroupClickEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionGroupClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An BootstrapClientAccordionGroup object that represents a group related to the event.
    * @param htmlElement An HTML object that contains the processed accordion group.
    */
  def this(
    processOnServer: Boolean,
    group: typings.devexpressWeb.BootstrapClientAccordionGroup,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
}

