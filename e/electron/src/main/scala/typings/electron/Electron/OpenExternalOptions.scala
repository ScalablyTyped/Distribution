package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenExternalOptions extends js.Object {
  /**
    * `true` to bring the opened application to the foreground. The default is `true`.
    *
    * @platform darwin
    */
  var activate: js.UndefOr[Boolean] = js.undefined
  /**
    * The working directory.
    *
    * @platform win32
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}

object OpenExternalOptions {
  @scala.inline
  def apply(activate: js.UndefOr[Boolean] = js.undefined, workingDirectory: String = null): OpenExternalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenExternalOptions]
  }
}

