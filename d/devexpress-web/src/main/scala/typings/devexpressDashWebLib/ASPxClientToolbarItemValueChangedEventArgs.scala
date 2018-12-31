package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemValueChanged event.
  */
trait ASPxClientToolbarItemValueChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Provides access to the toolbar's value editor on the client.
    * Value: An ASPxClientControl descendant.
    */
  var editor: ASPxClientControl
  /**
    * Gets the menu item object related to the event.
    * Value: An ASPxClientMenuItem object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientMenuItem
}

