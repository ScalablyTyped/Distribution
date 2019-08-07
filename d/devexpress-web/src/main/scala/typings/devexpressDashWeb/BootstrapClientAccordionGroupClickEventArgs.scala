package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's group headers.
  */
@JSGlobal("BootstrapClientAccordionGroupClickEventArgs")
@js.native
class BootstrapClientAccordionGroupClickEventArgs protected () extends BootstrapClientAccordionGroupCancelEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionGroupClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An BootstrapClientAccordionGroup object that represents a group related to the event.
    * @param htmlElement An HTML object that contains the processed accordion group.
    */
  def this(
    processOnServer: Boolean,
    group: BootstrapClientAccordionGroup,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
  /**
    * Gets an HTML object that contains the processed Accordion group.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

