package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleOnAllWorkspacesOptions extends js.Object {
  /**
    * Sets whether the window should be visible above fullscreen windows _deprecated_
    *
    * @platform darwin
    */
  var visibleOnFullScreen: js.UndefOr[Boolean] = js.undefined
}

object VisibleOnAllWorkspacesOptions {
  @scala.inline
  def apply(visibleOnFullScreen: js.UndefOr[Boolean] = js.undefined): VisibleOnAllWorkspacesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visibleOnFullScreen)) __obj.updateDynamic("visibleOnFullScreen")(visibleOnFullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleOnAllWorkspacesOptions]
  }
}

