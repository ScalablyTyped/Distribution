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
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  override var group: typings.devexpressWeb.BootstrapClientAccordionGroup = js.native
  /**
    * Gets an HTML object that contains the processed Accordion group.
    */
  /* CompleteClass */
  override var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

