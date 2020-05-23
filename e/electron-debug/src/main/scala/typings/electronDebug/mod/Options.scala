package typings.electronDebug.mod

import typings.electronDebug.electronDebugStrings.bottom
import typings.electronDebug.electronDebugStrings.detach
import typings.electronDebug.electronDebugStrings.previous
import typings.electronDebug.electronDebugStrings.right
import typings.electronDebug.electronDebugStrings.undocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The dock state to open DevTools in.
  		@default 'previous'
  		*/
  val devToolsMode: js.UndefOr[undocked | right | bottom | previous | detach] = js.undefined
  /**
  		Default: [Only in development](https://github.com/sindresorhus/electron-is-dev)
  		*/
  val isEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		Show DevTools on each created `BrowserWindow`.
  		@default true
  		*/
  val showDevTools: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    devToolsMode: undocked | right | bottom | previous | detach = null,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    showDevTools: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (devToolsMode != null) __obj.updateDynamic("devToolsMode")(devToolsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDevTools)) __obj.updateDynamic("showDevTools")(showDevTools.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

