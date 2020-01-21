package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsMoved event.
  */
@JSGlobal("ASPxClientFileManagerItemsMovedEventArgs")
@js.native
class ASPxClientFileManagerItemsMovedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsMovedEventArgs object with the specified parameters.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    * @param oldFolderFullName A string value that specifies the folder's full name.
    */
  def this(items: js.Array[ASPxClientFileManagerItem], oldFolderFullName: String) = this()
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem] = js.native
  /**
    * Gets the full name of the folder from which items are moved.
    */
  var oldFolderFullName: String = js.native
}

