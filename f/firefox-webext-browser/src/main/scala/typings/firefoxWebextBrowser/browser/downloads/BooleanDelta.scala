package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanDelta extends js.Object {
  var current: js.UndefOr[Boolean] = js.undefined
  var previous: js.UndefOr[Boolean] = js.undefined
}

object BooleanDelta {
  @scala.inline
  def apply(current: js.UndefOr[Boolean] = js.undefined, previous: js.UndefOr[Boolean] = js.undefined): BooleanDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanDelta]
  }
}

