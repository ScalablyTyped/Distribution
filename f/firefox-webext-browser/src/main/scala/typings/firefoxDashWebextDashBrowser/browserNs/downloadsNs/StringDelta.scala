package typings.firefoxDashWebextDashBrowser.browserNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringDelta extends js.Object {
  var current: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
}

object StringDelta {
  @scala.inline
  def apply(current: String = null, previous: String = null): StringDelta = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    __obj.asInstanceOf[StringDelta]
  }
}

