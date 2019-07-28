package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemCopied event.
  */
trait ASPxClientFileManagerItemCopiedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the full name of the folder from which an item is copied.
    * Value: A string value that specifies the folder's full name.
    */
  var oldFolderFullName: String
}

object ASPxClientFileManagerItemCopiedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemCopiedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isFolder = isFolder, name = name, oldFolderFullName = oldFolderFullName)
  
    __obj.asInstanceOf[ASPxClientFileManagerItemCopiedEventArgs]
  }
}

