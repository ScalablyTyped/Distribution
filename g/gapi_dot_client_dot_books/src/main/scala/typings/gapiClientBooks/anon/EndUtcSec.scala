package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[String] = js.undefined
  var startUtcSec: js.UndefOr[String] = js.undefined
}

object EndUtcSec {
  @scala.inline
  def apply(endUtcSec: String = null, startUtcSec: String = null): EndUtcSec = {
    val __obj = js.Dynamic.literal()
    if (endUtcSec != null) __obj.updateDynamic("endUtcSec")(endUtcSec.asInstanceOf[js.Any])
    if (startUtcSec != null) __obj.updateDynamic("startUtcSec")(startUtcSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndUtcSec]
  }
}

