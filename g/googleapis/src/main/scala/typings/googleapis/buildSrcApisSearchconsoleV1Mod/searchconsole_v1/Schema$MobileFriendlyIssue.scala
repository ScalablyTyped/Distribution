package typings.googleapis.buildSrcApisSearchconsoleV1Mod.searchconsole_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly issue.
  */
@js.native
trait Schema$MobileFriendlyIssue extends js.Object {
  /**
    * Rule violated.
    */
  var rule: js.UndefOr[String] = js.native
}

object Schema$MobileFriendlyIssue {
  @scala.inline
  def apply(rule: String = null): Schema$MobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MobileFriendlyIssue]
  }
}

