package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenExternalSyncOptions extends js.Object {
  /**
    * true to bring the opened application to the foreground. The default is true.
    */
  var activate: js.UndefOr[Boolean] = js.undefined
  /**
    * The working directory.
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}

object OpenExternalSyncOptions {
  @scala.inline
  def apply(activate: js.UndefOr[Boolean] = js.undefined, workingDirectory: String = null): OpenExternalSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate)
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory)
    __obj.asInstanceOf[OpenExternalSyncOptions]
  }
}

