package typings.electron.Electron

import typings.electron.electronStrings.error
import typings.electron.electronStrings.indeterminate
import typings.electron.electronStrings.none
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarOptions extends js.Object {
  /**
    * Mode for the progress bar. Can be `none`, `normal`, `indeterminate`, `error` or
    * `paused`.
    *
    * @platform win32
    */
  var mode: none | normal | indeterminate | error | paused = js.native
}

object ProgressBarOptions {
  @scala.inline
  def apply(mode: none | normal | indeterminate | error | paused): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: none | normal | indeterminate | error | paused): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
  
}

