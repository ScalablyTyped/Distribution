package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDevToolsOptions extends js.Object {
  /**
    * Whether to bring the opened devtools window to the foreground. The default is
    * true.
    */
  var activate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Opens the devtools with specified dock state, can be right, bottom, undocked,
    * detach. Defaults to last used dock state. In undocked mode it's possible to dock
    * back. In detach mode it's not.
    */
  var mode: electronLib.electronLibStrings.right | electronLib.electronLibStrings.bottom | electronLib.electronLibStrings.undocked | electronLib.electronLibStrings.detach
}

object OpenDevToolsOptions {
  @scala.inline
  def apply(
    mode: electronLib.electronLibStrings.right | electronLib.electronLibStrings.bottom | electronLib.electronLibStrings.undocked | electronLib.electronLibStrings.detach,
    activate: js.UndefOr[scala.Boolean] = js.undefined
  ): OpenDevToolsOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate)
    __obj.asInstanceOf[OpenDevToolsOptions]
  }
}

