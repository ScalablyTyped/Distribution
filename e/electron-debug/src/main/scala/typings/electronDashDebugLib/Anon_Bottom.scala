package typings
package electronDashDebugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /** Enable debug options. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Show DevTools on each created BrowserWindow. */
  var showDevTools: js.UndefOr[
    scala.Boolean | electronDashDebugLib.electronDashDebugLibStrings.right | electronDashDebugLib.electronDashDebugLibStrings.bottom | electronDashDebugLib.electronDashDebugLibStrings.undocked
  ] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    showDevTools: scala.Boolean | electronDashDebugLib.electronDashDebugLibStrings.right | electronDashDebugLib.electronDashDebugLibStrings.bottom | electronDashDebugLib.electronDashDebugLibStrings.undocked = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (showDevTools != null) __obj.updateDynamic("showDevTools")(showDevTools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

