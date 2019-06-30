package typings
package electronDashDebugLib.electronDashDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The dock state to open DevTools in.
  		@default 'previous'
  		*/
  val devToolsMode: js.UndefOr[
    electronDashDebugLib.electronDashDebugLibStrings.undocked | electronDashDebugLib.electronDashDebugLibStrings.right | electronDashDebugLib.electronDashDebugLibStrings.bottom | electronDashDebugLib.electronDashDebugLibStrings.previous | electronDashDebugLib.electronDashDebugLibStrings.detach
  ] = js.undefined
  /**
  		Default: [Only in development](https://github.com/sindresorhus/electron-is-dev)
  		*/
  val isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Show DevTools on each created `BrowserWindow`.
  		@default true
  		*/
  val showDevTools: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    devToolsMode: electronDashDebugLib.electronDashDebugLibStrings.undocked | electronDashDebugLib.electronDashDebugLibStrings.right | electronDashDebugLib.electronDashDebugLibStrings.bottom | electronDashDebugLib.electronDashDebugLibStrings.previous | electronDashDebugLib.electronDashDebugLibStrings.detach = null,
    isEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    showDevTools: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (devToolsMode != null) __obj.updateDynamic("devToolsMode")(devToolsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (!js.isUndefined(showDevTools)) __obj.updateDynamic("showDevTools")(showDevTools)
    __obj.asInstanceOf[Options]
  }
}

