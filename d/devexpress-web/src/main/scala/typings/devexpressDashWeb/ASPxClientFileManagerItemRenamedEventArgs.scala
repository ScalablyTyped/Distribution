package typings.devexpressDashWeb

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
  var oldName: String
}

object ASPxClientFileManagerItemRenamedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldName: String): ASPxClientFileManagerItemRenamedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, isFolder = isFolder, name = name, oldName = oldName)
  
    __obj.asInstanceOf[ASPxClientFileManagerItemRenamedEventArgs]
  }
}

