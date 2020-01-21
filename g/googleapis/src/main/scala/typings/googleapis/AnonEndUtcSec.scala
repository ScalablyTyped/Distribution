package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[String] = js.native
  var startUtcSec: js.UndefOr[String] = js.native
}

object AnonEndUtcSec {
  @scala.inline
  def apply(endUtcSec: String = null, startUtcSec: String = null): AnonEndUtcSec = {
    val __obj = js.Dynamic.literal()
    if (endUtcSec != null) __obj.updateDynamic("endUtcSec")(endUtcSec.asInstanceOf[js.Any])
    if (startUtcSec != null) __obj.updateDynamic("startUtcSec")(startUtcSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndUtcSec]
  }
}

