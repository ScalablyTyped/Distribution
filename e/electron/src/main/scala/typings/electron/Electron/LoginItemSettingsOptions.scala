package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginItemSettingsOptions extends js.Object {
  /**
    * The command-line arguments to compare against. Defaults to an empty array.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * The executable path to compare against. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.native
}

object LoginItemSettingsOptions {
  @scala.inline
  def apply(): LoginItemSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginItemSettingsOptions]
  }
  @scala.inline
  implicit class LoginItemSettingsOptionsOps[Self <: LoginItemSettingsOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

