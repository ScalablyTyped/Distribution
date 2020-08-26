package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemCopied event.
  */
@js.native
trait ASPxClientFileManagerItemCopiedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the full name of the folder from which an item is copied.
    */
  var oldFolderFullName: String = js.native
}

object ASPxClientFileManagerItemCopiedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemCopiedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemCopiedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerItemCopiedEventArgsOps[Self <: ASPxClientFileManagerItemCopiedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOldFolderFullName(value: String): Self = this.set("oldFolderFullName", value.asInstanceOf[js.Any])
  }
  
}

