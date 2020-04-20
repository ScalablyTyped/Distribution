package typings.electron.Electron

import typings.electron.electronStrings.error
import typings.electron.electronStrings.indeterminate
import typings.electron.electronStrings.none
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  /**
    * Mode for the progress bar. Can be `none`, `normal`, `indeterminate`, `error` or
    * `paused`.
    *
    * @platform win32
    */
  var mode: none | normal | indeterminate | error | paused
}

object ProgressBarOptions {
  @scala.inline
  def apply(mode: none | normal | indeterminate | error | paused): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

