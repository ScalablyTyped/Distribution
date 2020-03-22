package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemSettingsOptions extends js.Object {
  /**
    * The command-line arguments to compare against. Defaults to an empty array.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The executable path to compare against. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.undefined
}

object LoginItemSettingsOptions {
  @scala.inline
  def apply(args: js.Array[String] = null, path: String = null): LoginItemSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemSettingsOptions]
  }
}

