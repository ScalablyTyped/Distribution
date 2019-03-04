package typings
package devexpressDashWebLib

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
  var oldFolderFullName: java.lang.String
}

object ASPxClientFileManagerItemCopiedEventArgs {
  @scala.inline
  def apply(
    fullName: java.lang.String,
    isFolder: scala.Boolean,
    name: java.lang.String,
    oldFolderFullName: java.lang.String
  ): ASPxClientFileManagerItemCopiedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isFolder = isFolder, name = name, oldFolderFullName = oldFolderFullName)
  
    __obj.asInstanceOf[ASPxClientFileManagerItemCopiedEventArgs]
  }
}

