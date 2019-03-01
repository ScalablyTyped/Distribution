package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleOnAllWorkspacesOptions extends js.Object {
  /**
    * Sets whether the window should be visible above fullscreen windows
    */
  var visibleOnFullScreen: js.UndefOr[scala.Boolean] = js.undefined
}

object VisibleOnAllWorkspacesOptions {
  @scala.inline
  def apply(visibleOnFullScreen: js.UndefOr[scala.Boolean] = js.undefined): VisibleOnAllWorkspacesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visibleOnFullScreen)) __obj.updateDynamic("visibleOnFullScreen")(visibleOnFullScreen)
    __obj.asInstanceOf[VisibleOnAllWorkspacesOptions]
  }
}

