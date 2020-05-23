package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
  */
@JSGlobal("ASPxClientListEditItemFilteringEventArgs")
@js.native
/**
  * Initializes a new instance of the ASPxClientListEditItemFilteringEventArgs class.
  */
class ASPxClientListEditItemFilteringEventArgs ()
  extends typings.devexpressWeb.ASPxClientListEditItemFilteringEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  /* CompleteClass */
  override var filter: String = js.native
  /**
    * Specifies whether the item should be shown in the search result.
    */
  /* CompleteClass */
  override var isFit: Boolean = js.native
  /**
    * Gets the editor item object related to the event.
    */
  /* CompleteClass */
  override var item: typings.devexpressWeb.ASPxClientListEditItem = js.native
}

