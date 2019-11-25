package typings.gapiDotClientDotSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIssue extends js.Object {
  /** Describes a blocked resource issue. */
  var blockedResource: js.UndefOr[BlockedResource] = js.undefined
}

object ResourceIssue {
  @scala.inline
  def apply(blockedResource: BlockedResource = null): ResourceIssue = {
    val __obj = js.Dynamic.literal()
    if (blockedResource != null) __obj.updateDynamic("blockedResource")(blockedResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIssue]
  }
}

