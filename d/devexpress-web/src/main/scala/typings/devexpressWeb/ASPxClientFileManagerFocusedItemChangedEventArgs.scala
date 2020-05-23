package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FocusedItemChanged event.
  */
trait ASPxClientFileManagerFocusedItemChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the item currently being processed.
    */
  var fullName: String
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem
  /**
    * Gets the name of the focused item.
    */
  var name: String
}

object ASPxClientFileManagerFocusedItemChangedEventArgs {
  @scala.inline
  def apply(fullName: String, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerFocusedItemChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFocusedItemChangedEventArgs]
  }
}

