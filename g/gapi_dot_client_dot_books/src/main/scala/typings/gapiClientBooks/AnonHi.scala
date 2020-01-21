package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHi extends js.Object {
  var hi: js.UndefOr[AnonLatitude] = js.undefined
  var lo: js.UndefOr[AnonLatitude] = js.undefined
}

object AnonHi {
  @scala.inline
  def apply(hi: AnonLatitude = null, lo: AnonLatitude = null): AnonHi = {
    val __obj = js.Dynamic.literal()
    if (hi != null) __obj.updateDynamic("hi")(hi.asInstanceOf[js.Any])
    if (lo != null) __obj.updateDynamic("lo")(lo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHi]
  }
}

