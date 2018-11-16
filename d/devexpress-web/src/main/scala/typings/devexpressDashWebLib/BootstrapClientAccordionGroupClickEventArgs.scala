package typings
package devexpressDashWebLib

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

