package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHi extends js.Object {
  var hi: js.UndefOr[AnonLatitude] = js.native
  var lo: js.UndefOr[AnonLatitude] = js.native
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

