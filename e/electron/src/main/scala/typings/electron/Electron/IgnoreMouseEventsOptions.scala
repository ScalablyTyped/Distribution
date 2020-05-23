package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreMouseEventsOptions extends js.Object {
  /**
    * If true, forwards mouse move messages to Chromium, enabling mouse related events
    * such as `mouseleave`. Only used when `ignore` is true. If `ignore` is false,
    * forwarding is always disabled regardless of this value.
    *
    * @platform darwin,win32
    */
  var forward: js.UndefOr[Boolean] = js.undefined
}

object IgnoreMouseEventsOptions {
  @scala.inline
  def apply(forward: js.UndefOr[Boolean] = js.undefined): IgnoreMouseEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreMouseEventsOptions]
  }
}

