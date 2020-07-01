package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveIndex extends js.Object {
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused
    * (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * The position the new tab should take in the window. The provided value will be clamped to between zero and
    * the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.undefined
}

object ActiveIndex {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, index: js.UndefOr[Double] = js.undefined): ActiveIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
}

