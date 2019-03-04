package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemRenamed event.
  */
trait ASPxClientFileManagerItemRenamedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the previous name of the renamed item.
    * Value: A  string value that specifies the item name.
    */
  var oldName: java.lang.String
}

object ASPxClientFileManagerItemRenamedEventArgs {
  @scala.inline
  def apply(
    fullName: java.lang.String,
    isFolder: scala.Boolean,
    name: java.lang.String,
    oldName: java.lang.String
  ): ASPxClientFileManagerItemRenamedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isFolder = isFolder, name = name, oldName = oldName)
  
    __obj.asInstanceOf[ASPxClientFileManagerItemRenamedEventArgs]
  }
}

