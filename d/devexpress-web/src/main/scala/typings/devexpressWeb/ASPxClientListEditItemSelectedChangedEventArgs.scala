package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientListEdit.SelectedIndexChanged event.
  */
trait ASPxClientListEditItemSelectedChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean
}

object ASPxClientListEditItemSelectedChangedEventArgs {
  @scala.inline
  def apply(index: Double, isSelected: Boolean, processOnServer: Boolean): ASPxClientListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditItemSelectedChangedEventArgs]
  }
}

