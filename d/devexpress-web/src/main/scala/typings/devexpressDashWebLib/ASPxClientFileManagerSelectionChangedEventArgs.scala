package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectionChanged event.
  */
trait ASPxClientFileManagerSelectionChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the file currently being processed.
    * Value: A string value that is the file's full name.
    */
  var fullName: java.lang.String
  /**
    * Gets whether the item has been selected.
    * Value: true if the file has been selected; otherwise, false.
    */
  var isSelected: scala.Boolean
  /**
    * Gets the file manager item object related to the event.
    * Value: An <see cref="ASPxClientFileManagerItem" /> object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientFileManagerItem
  /**
    * Gets the name of the currently processed file.
    * Value: A string value that specifies the file's name.
    */
  var name: java.lang.String
}

object ASPxClientFileManagerSelectionChangedEventArgs {
  @scala.inline
  def apply(
    fullName: java.lang.String,
    isSelected: scala.Boolean,
    item: ASPxClientFileManagerItem,
    name: java.lang.String
  ): ASPxClientFileManagerSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isSelected = isSelected, item = item, name = name)
  
    __obj.asInstanceOf[ASPxClientFileManagerSelectionChangedEventArgs]
  }
}

