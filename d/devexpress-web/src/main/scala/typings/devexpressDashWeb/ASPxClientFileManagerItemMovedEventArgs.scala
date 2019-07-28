package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemMoved event.
  */
trait ASPxClientFileManagerItemMovedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the full name of the folder from which an item is moved.
    * Value: A string value that specifies the folder's full name.
    */
  var oldFolderFullName: String
}

object ASPxClientFileManagerItemMovedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemMovedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isFolder = isFolder, name = name, oldFolderFullName = oldFolderFullName)
  
    __obj.asInstanceOf[ASPxClientFileManagerItemMovedEventArgs]
  }
}

