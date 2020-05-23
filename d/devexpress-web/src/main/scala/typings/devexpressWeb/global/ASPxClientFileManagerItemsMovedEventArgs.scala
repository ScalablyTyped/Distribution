package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsMoved event.
  */
@JSGlobal("ASPxClientFileManagerItemsMovedEventArgs")
@js.native
class ASPxClientFileManagerItemsMovedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerItemsMovedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsMovedEventArgs object with the specified parameters.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    * @param oldFolderFullName A string value that specifies the folder's full name.
    */
  def this(items: js.Array[typings.devexpressWeb.ASPxClientFileManagerItem], oldFolderFullName: String) = this()
  /**
    * Gets an array of the currently processed items.
    */
  /* CompleteClass */
  override var items: js.Array[typings.devexpressWeb.ASPxClientFileManagerItem] = js.native
  /**
    * Gets the full name of the folder from which items are moved.
    */
  /* CompleteClass */
  override var oldFolderFullName: String = js.native
}

