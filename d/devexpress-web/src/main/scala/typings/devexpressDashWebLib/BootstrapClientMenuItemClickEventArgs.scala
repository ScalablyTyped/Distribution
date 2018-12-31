package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's items.
  */
trait BootstrapClientMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an HTML object that contains the processed Menu item.
    * Value: An HTML object.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: A DHTML event object.
    */
  var htmlEvent: js.Object
  /**
    * Gets the menu item object related to the event.
    * Value: A BootstrapClientMenuItem object, manipulations on which forced the event to be raised.
    */
  var item: BootstrapClientMenuItem
}

