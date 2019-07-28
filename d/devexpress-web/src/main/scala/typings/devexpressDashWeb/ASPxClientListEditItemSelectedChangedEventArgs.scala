package typings.devexpressDashWeb

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
  var index: Double
  /**
    * Gets whether the item has been selected.
    * Value: true if the item is selected; otherwise, false.
    */
  var isSelected: Boolean
}

object ASPxClientListEditItemSelectedChangedEventArgs {
  @scala.inline
  def apply(index: Double, isSelected: Boolean, processOnServer: Boolean): ASPxClientListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index, isSelected = isSelected, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientListEditItemSelectedChangedEventArgs]
  }
}

