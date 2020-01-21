package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[String] = js.undefined
  var startUtcSec: js.UndefOr[String] = js.undefined
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

