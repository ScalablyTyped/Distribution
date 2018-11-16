package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for events which involve clicking on the control's items.
 */

trait ASPxClientCloudControlItemEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
       * Gets the HTML object that contains the processed item.
       * Value: An object representing a container for the item related to the event.
       */
  var htmlElement: js.Object
  /**
       * Gets a DHTML event object that relates to the processed event.
       * Value: An object that maintains DHTML event-specific information.
       */
  var htmlEvent: js.Object
  /**
       * Gets the name that uniquely identifies the processed item.
       * Value: A string value that represents the value assigned to the item's Name property.
       */
  var name: js.Object
}

