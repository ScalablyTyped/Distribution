package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleDelta extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  var previous: js.UndefOr[Double] = js.undefined
}

object DoubleDelta {
  @scala.inline
  def apply(current: js.UndefOr[Double] = js.undefined, previous: js.UndefOr[Double] = js.undefined): DoubleDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleDelta]
  }
}

