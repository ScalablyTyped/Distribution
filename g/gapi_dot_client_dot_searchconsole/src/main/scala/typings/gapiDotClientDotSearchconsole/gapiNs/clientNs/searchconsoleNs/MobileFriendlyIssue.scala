package typings.gapiDotClientDotSearchconsole.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileFriendlyIssue extends js.Object {
  /** Rule violated. */
  var rule: js.UndefOr[String] = js.undefined
}

object MobileFriendlyIssue {
  @scala.inline
  def apply(rule: String = null): MobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[MobileFriendlyIssue]
  }
}

