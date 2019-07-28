package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemFiltering events.
  */
trait ASPxClientListEditItemFilteringEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    * Value: A string value specifying the filter text typed by a user.
    */
  var filter: String
  /**
    * Specifies whether the item should be shown in the search result.
    * Value: true, to show the item; otherwise, false.
    */
  var isFit: Boolean
  /**
    * Gets the editor item object related to the event.
    * Value: An ASPxClientListEditItem object representing the processed editor item.
    */
  var item: ASPxClientListEditItem
}

object ASPxClientListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: ASPxClientListEditItem): ASPxClientListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter, isFit = isFit, item = item)
  
    __obj.asInstanceOf[ASPxClientListEditItemFilteringEventArgs]
  }
}

