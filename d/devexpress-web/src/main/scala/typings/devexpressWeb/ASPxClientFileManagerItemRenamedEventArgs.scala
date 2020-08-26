package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemRenamed event.
  */
@js.native
trait ASPxClientFileManagerItemRenamedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Gets the previous name of the renamed item.
    */
  var oldName: String = js.native
}

object ASPxClientFileManagerItemRenamedEventArgs {
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldName: String): ASPxClientFileManagerItemRenamedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemRenamedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerItemRenamedEventArgsOps[Self <: ASPxClientFileManagerItemRenamedEventArgs] (val x: Self) extends AnyVal {
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
    def setOldName(value: String): Self = this.set("oldName", value.asInstanceOf[js.Any])
  }
  
}

