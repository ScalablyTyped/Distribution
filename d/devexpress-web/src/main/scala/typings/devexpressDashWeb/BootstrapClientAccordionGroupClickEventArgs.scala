package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's group headers.
  */
trait BootstrapClientAccordionGroupClickEventArgs extends BootstrapClientAccordionGroupCancelEventArgs {
  /**
    * Gets an HTML object that contains the processed Accordion group.
    * Value: An HTML object.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: A DHTML event object.
    */
  var htmlEvent: js.Object
}

object BootstrapClientAccordionGroupClickEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    group: BootstrapClientAccordionGroup,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: Boolean
  ): BootstrapClientAccordionGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, group = group, htmlElement = htmlElement, htmlEvent = htmlEvent, processOnServer = processOnServer)
  
    __obj.asInstanceOf[BootstrapClientAccordionGroupClickEventArgs]
  }
}

