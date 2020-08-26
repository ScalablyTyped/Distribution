package typings.electron.Electron

import typings.electron.electronStrings.bottom
import typings.electron.electronStrings.detach
import typings.electron.electronStrings.right
import typings.electron.electronStrings.undocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDevToolsOptions extends js.Object {
  /**
    * Whether to bring the opened devtools window to the foreground. The default is
    * `true`.
    */
  var activate: js.UndefOr[Boolean] = js.native
  /**
    * Opens the devtools with specified dock state, can be `right`, `bottom`,
    * `undocked`, `detach`. Defaults to last used dock state. In `undocked` mode it's
    * possible to dock back. In `detach` mode it's not.
    */
  var mode: right | bottom | undocked | detach = js.native
}

object OpenDevToolsOptions {
  @scala.inline
  def apply(mode: right | bottom | undocked | detach): OpenDevToolsOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDevToolsOptions]
  }
  @scala.inline
  implicit class OpenDevToolsOptionsOps[Self <: OpenDevToolsOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: right | bottom | undocked | detach): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivate(value: Boolean): Self = this.set("activate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
  }
  
}

