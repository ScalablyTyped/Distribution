package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[String] = js.native
  var startUtcSec: js.UndefOr[String] = js.native
}

object Anon_EndUtcSec {
  @scala.inline
  def apply(endUtcSec: String = null, startUtcSec: String = null): Anon_EndUtcSec = {
    val __obj = js.Dynamic.literal()
    if (endUtcSec != null) __obj.updateDynamic("endUtcSec")(endUtcSec.asInstanceOf[js.Any])
    if (startUtcSec != null) __obj.updateDynamic("startUtcSec")(startUtcSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndUtcSec]
  }
}

