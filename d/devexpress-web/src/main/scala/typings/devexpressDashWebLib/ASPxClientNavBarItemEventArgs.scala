package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for events which concern manipulations on items.
 */

trait ASPxClientNavBarItemEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
       * Gets the HTML object that contains the processed navbar item.
       * Value: An object representing a container for the navbar item related to the event.
       */
  var htmlElement: js.Object
  /**
       * Gets a DHTML event object that relates to the processed event.
       * Value: An object that maintains DHTML event-specific information.
       */
  var htmlEvent: js.Object
  /**
       * Gets the item object related to the event.
       * Value: An ASPxClientNavBarItem object, manipulations on which forced the event to be raised.
       */
  var item: ASPxClientNavBarItem
}

