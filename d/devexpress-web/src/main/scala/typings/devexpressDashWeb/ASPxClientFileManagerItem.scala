package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the file manager's FileManagerItem object and serves as a base class for client file and folder objects.
  */
@JSGlobal("ASPxClientFileManagerItem")
@js.native
class ASPxClientFileManagerItem () extends js.Object {
  /**
    * Gets the item's unique identifier.
    */
  var id: String = js.native
  /**
    * Gets a value that indicates if the current file manager item is a folder.
    */
  var isFolder: Boolean = js.native
  /**
    * Gets the name of the current item.
    */
  var name: String = js.native
  /**
    * Gets the current item's full name with the specified settings. A string value that is the full name of an item.
    * @param separator A string value that specifies the separator between the folder name inside the item's full name.
    * @param skipRootFolder true, to skip the root folder; otherwise, false.
    */
  def GetFullName(): String = js.native
  def GetFullName(separator: String): String = js.native
  def GetFullName(separator: String, skipRootFolder: Boolean): String = js.native
  /**
    * Gets the current item's metadata.
    */
  def GetMetadata(): js.Any = js.native
  /**
    * Gets a value indicating whether the item is selected in the file manager.
    */
  def IsSelected(): Boolean = js.native
  /**
    * Specifies whether the file manager item is selected.
    * @param selected true, to select the item; otherwise, false.
    */
  def SetSelected(selected: Boolean): Unit = js.native
}

