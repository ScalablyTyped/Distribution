package typings.devexpressDashWeb

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
  var fullName: String
  /**
    * Gets whether the item has been selected.
    * Value: true if the file has been selected; otherwise, false.
    */
  var isSelected: Boolean
  /**
    * Gets the file manager item object related to the event.
    * Value: An <see cref="ASPxClientFileManagerItem" /> object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientFileManagerItem
  /**
    * Gets the name of the currently processed file.
    * Value: A string value that specifies the file's name.
    */
  var name: String
}

object ASPxClientFileManagerSelectionChangedEventArgs {
  @scala.inline
  def apply(fullName: String, isSelected: Boolean, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isSelected = isSelected, item = item, name = name)
  
    __obj.asInstanceOf[ASPxClientFileManagerSelectionChangedEventArgs]
  }
}

