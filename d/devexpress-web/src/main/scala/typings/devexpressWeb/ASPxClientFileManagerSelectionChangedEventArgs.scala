package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.SelectionChanged event.
  */
trait ASPxClientFileManagerSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the file currently being processed.
    */
  var fullName: String
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem
  /**
    * Gets the name of the currently processed file.
    */
  var name: String
}

object ASPxClientFileManagerSelectionChangedEventArgs {
  @scala.inline
  def apply(fullName: String, isSelected: Boolean, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerSelectionChangedEventArgs]
  }
}

