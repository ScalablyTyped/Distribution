package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenExternalOptions extends js.Object {
  /**
    * `true` to bring the opened application to the foreground. The default is `true`.
    *
    * @platform darwin
    */
  var activate: js.UndefOr[Boolean] = js.native
  /**
    * The working directory.
    *
    * @platform win32
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object OpenExternalOptions {
  @scala.inline
  def apply(): OpenExternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenExternalOptions]
  }
  @scala.inline
  implicit class OpenExternalOptionsOps[Self <: OpenExternalOptions] (val x: Self) extends AnyVal {
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
    def setActivate(value: Boolean): Self = this.set("activate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
  
}

