package typings.devexpressDashWeb

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
class ASPxClientListEditItemFilteringEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String = js.native
  /**
    * Specifies whether the item should be shown in the search result.
    */
  var isFit: Boolean = js.native
  /**
    * Gets the editor item object related to the event.
    */
  var item: ASPxClientListEditItem = js.native
}

