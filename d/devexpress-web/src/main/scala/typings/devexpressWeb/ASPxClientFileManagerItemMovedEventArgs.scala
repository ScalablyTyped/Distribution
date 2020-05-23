package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemMoved event.
  */
trait ASPxClientFileManagerItemMovedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the full name of the folder from which an item is moved.
    */
  var oldFolderFullName: String
}

object ASPxClientFileManagerItemMovedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemMovedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemMovedEventArgs]
  }
}

