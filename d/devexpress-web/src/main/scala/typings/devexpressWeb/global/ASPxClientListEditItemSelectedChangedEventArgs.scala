package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientListEdit.SelectedIndexChanged event.
  */
@JSGlobal("ASPxClientListEditItemSelectedChangedEventArgs")
@js.native
class ASPxClientListEditItemSelectedChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientListEditItemSelectedChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientListEditItemSelectedChangedEventArgs class with the specified settings.
    * @param index An integer value that specifies the index of an item.
    * @param isSelected true if an item is selected; otherwise, false.
    */
  def this(index: Double, isSelected: Boolean) = this()
  /**
    * Gets the index of the item related to the event.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets whether the item has been selected.
    */
  /* CompleteClass */
  override var isSelected: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

