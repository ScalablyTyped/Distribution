package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FocusedItemChanged event.
  */
@JSGlobal("ASPxClientFileManagerFocusedItemChangedEventArgs")
@js.native
class ASPxClientFileManagerFocusedItemChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFocusedItemChangedEventArgs class.
    * @param item A ASPxClientFileManagerItem object that is an item, manipulations on which forced the event to be raised.
    * @param name A string value that specifies the item's name.
    * @param fullName A string value that is the item's full name.
    */
  def this(item: ASPxClientFileManagerItem, name: String, fullName: String) = this()
  /**
    * Gets the full name of the item currently being processed.
    */
  var fullName: String = js.native
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem = js.native
  /**
    * Gets the name of the focused item.
    */
  var name: String = js.native
}

