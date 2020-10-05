package typings.electron.Electron

import typings.electron.electronStrings.file
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpListItem extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/jump-list-item
  /**
    * The command line arguments when `program` is executed. Should only be set if
    * `type` is `task`.
    */
  var args: js.UndefOr[String] = js.native
  /**
    * Description of the task (displayed in a tooltip). Should only be set if `type`
    * is `task`.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The index of the icon in the resource file. If a resource file contains multiple
    * icons this value can be used to specify the zero-based index of the icon that
    * should be displayed for this task. If a resource file contains only one icon,
    * this property should be set to zero.
    */
  var iconIndex: js.UndefOr[Double] = js.native
  /**
    * The absolute path to an icon to be displayed in a Jump List, which can be an
    * arbitrary resource file that contains an icon (e.g. `.ico`, `.exe`, `.dll`). You
    * can usually specify `process.execPath` to show the program icon.
    */
  var iconPath: js.UndefOr[String] = js.native
  /**
    * Path of the file to open, should only be set if `type` is `file`.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Path of the program to execute, usually you should specify `process.execPath`
    * which opens the current program. Should only be set if `type` is `task`.
    */
  var program: js.UndefOr[String] = js.native
  /**
    * The text to be displayed for the item in the Jump List. Should only be set if
    * `type` is `task`.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[task | separator | file] = js.native
  /**
    * The working directory. Default is empty.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object JumpListItem {
  @scala.inline
  def apply(): JumpListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpListItem]
  }
  @scala.inline
  implicit class JumpListItemOps[Self <: JumpListItem] (val x: Self) extends AnyVal {
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
    def setArgs(value: String): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIconIndex(value: Double): Self = this.set("iconIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconIndex: Self = this.set("iconIndex", js.undefined)
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setProgram(value: String): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: task | separator | file): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
  
}

