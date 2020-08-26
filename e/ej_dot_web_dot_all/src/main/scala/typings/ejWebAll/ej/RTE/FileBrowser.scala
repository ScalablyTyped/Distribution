package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBrowser extends js.Object {
  /** This API is used to receive the server-side handler for file related operations.
    */
  var ajaxAction: js.UndefOr[String] = js.native
  /** Specifies the file type extension shown in the file browser window.
    */
  var extensionAllow: js.UndefOr[String] = js.native
  /** Specifies the directory to perform operations like create, delete and rename folder and files, and upload the selected files to the current directory.
    */
  var filePath: js.UndefOr[String] = js.native
}

object FileBrowser {
  @scala.inline
  def apply(): FileBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileBrowser]
  }
  @scala.inline
  implicit class FileBrowserOps[Self <: FileBrowser] (val x: Self) extends AnyVal {
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
    def setAjaxAction(value: String): Self = this.set("ajaxAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxAction: Self = this.set("ajaxAction", js.undefined)
    @scala.inline
    def setExtensionAllow(value: String): Self = this.set("extensionAllow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionAllow: Self = this.set("extensionAllow", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
  }
  
}

