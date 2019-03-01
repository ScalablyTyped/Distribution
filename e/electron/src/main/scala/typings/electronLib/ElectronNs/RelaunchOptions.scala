package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelaunchOptions extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var execPath: js.UndefOr[java.lang.String] = js.undefined
}

object RelaunchOptions {
  @scala.inline
  def apply(args: js.Array[java.lang.String] = null, execPath: java.lang.String = null): RelaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (execPath != null) __obj.updateDynamic("execPath")(execPath)
    __obj.asInstanceOf[RelaunchOptions]
  }
}

