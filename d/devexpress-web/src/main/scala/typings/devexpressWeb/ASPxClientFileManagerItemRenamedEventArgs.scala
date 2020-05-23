package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemRenamed event.
  */
trait ASPxClientFileManagerItemRenamedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the previous name of the renamed item.
    */
  var oldName: String
}

object ASPxClientFileManagerItemRenamedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldName: String): ASPxClientFileManagerItemRenamedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemRenamedEventArgs]
  }
}

