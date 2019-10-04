package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeRule extends js.Object {
  /** The type of date-time grouping to apply. */
  var `type`: js.UndefOr[String] = js.undefined
}

object DateTimeRule {
  @scala.inline
  def apply(`type`: String = null): DateTimeRule = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DateTimeRule]
  }
}

