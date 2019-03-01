package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemSettingsOptions extends js.Object {
  /**
    * The command-line arguments to compare against. Defaults to an empty array.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The executable path to compare against. Defaults to process.execPath.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object LoginItemSettingsOptions {
  @scala.inline
  def apply(args: js.Array[java.lang.String] = null, path: java.lang.String = null): LoginItemSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[LoginItemSettingsOptions]
  }
}

