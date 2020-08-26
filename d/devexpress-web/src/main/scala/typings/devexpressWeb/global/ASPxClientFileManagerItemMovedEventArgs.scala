package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemMoved event.
  */
@JSGlobal("ASPxClientFileManagerItemMovedEventArgs")
@js.native
class ASPxClientFileManagerItemMovedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerItemMovedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemMovedEventArgs object with the specified parameters.
    * @param fullName A string value that is the item's full name.
    * @param name A string value that specifies the item's name.
    * @param oldFolderFullName A string value that specifies the folder's full name.
    * @param isFolder true if the processed item is a folder; false if the processed item is a file.
    */
  def this(fullName: String, name: String, oldFolderFullName: String, isFolder: Boolean) = this()
}

