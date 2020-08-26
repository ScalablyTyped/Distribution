package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.CurrentFolderChanged event.
  */
@js.native
trait ASPxClientFileManagerCurrentFolderChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the folder currently being processed.
    */
  var fullName: String = js.native
  /**
    * Gets the name of the currently processed folder.
    */
  var name: String = js.native
}

object ASPxClientFileManagerCurrentFolderChangedEventArgs {
  @scala.inline
  def apply(fullName: String, name: String): ASPxClientFileManagerCurrentFolderChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCurrentFolderChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerCurrentFolderChangedEventArgsOps[Self <: ASPxClientFileManagerCurrentFolderChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

