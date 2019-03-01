package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FocusedItemChanged event.
  */
trait ASPxClientFileManagerFocusedItemChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the item currently being processed.
    * Value: A string value that is the item's full name.
    */
  var fullName: java.lang.String
  /**
    * Gets the file manager item object related to the event.
    * Value: An <see cref="ASPxClientFileManagerItem" /> object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientFileManagerItem
  /**
    * Gets the name of the focused item.
    * Value: A string value that specifies the item's name.
    */
  var name: java.lang.String
}

object ASPxClientFileManagerFocusedItemChangedEventArgs {
  @scala.inline
  def apply(fullName: java.lang.String, item: ASPxClientFileManagerItem, name: java.lang.String): ASPxClientFileManagerFocusedItemChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientFileManagerFocusedItemChangedEventArgs]
  }
}

