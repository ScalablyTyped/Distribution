package typings
package devexpressDashWebLib

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
  var oldFolderFullName: java.lang.String
}

object ASPxClientFileManagerItemMovedEventArgs {
  @scala.inline
  def apply(
    fullName: java.lang.String,
    isFolder: scala.Boolean,
    name: java.lang.String,
    oldFolderFullName: java.lang.String
  ): ASPxClientFileManagerItemMovedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("isFolder")(isFolder)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("oldFolderFullName")(oldFolderFullName)
    __obj.asInstanceOf[ASPxClientFileManagerItemMovedEventArgs]
  }
}

