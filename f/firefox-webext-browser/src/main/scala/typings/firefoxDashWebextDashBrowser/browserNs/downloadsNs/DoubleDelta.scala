package typings.firefoxDashWebextDashBrowser.browserNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleDelta extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  var previous: js.UndefOr[Double] = js.undefined
}

object DoubleDelta {
  @scala.inline
  def apply(current: Int | Double = null, previous: Int | Double = null): DoubleDelta = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleDelta]
  }
}

