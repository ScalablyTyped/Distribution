package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
  */
trait ASPxClientListEditItemFilteringEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String
  /**
    * Specifies whether the item should be shown in the search result.
    */
  var isFit: Boolean
  /**
    * Gets the editor item object related to the event.
    */
  var item: ASPxClientListEditItem
}

object ASPxClientListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: ASPxClientListEditItem): ASPxClientListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditItemFilteringEventArgs]
  }
}

