package typings.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to the `search` function. */
trait SearchOptions extends js.Object {
  /** Whether to focus the input field and select its contents. */
  var focus: js.UndefOr[Boolean] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(focus: js.UndefOr[Boolean] = js.undefined): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

