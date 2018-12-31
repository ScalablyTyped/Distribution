package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectedIndexChanged event.
  */
trait ASPxClientListEditItemSelectedChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the item related to the event.
    * Value: An integer value that represents the item's index within the corresponding editor's item collection.
    */
  var index: scala.Double
  /**
    * Gets whether the item has been selected.
    * Value: true if the item is selected; otherwise, false.
    */
  var isSelected: scala.Boolean
}

