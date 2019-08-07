package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientListEdit.SelectedIndexChanged event.
  */
@JSGlobal("ASPxClientListEditItemSelectedChangedEventArgs")
@js.native
class ASPxClientListEditItemSelectedChangedEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientListEditItemSelectedChangedEventArgs class with the specified settings.
    * @param index An integer value that specifies the index of an item.
    * @param isSelected true if an item is selected; otherwise, false.
    */
  def this(index: Double, isSelected: Boolean) = this()
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean = js.native
}

