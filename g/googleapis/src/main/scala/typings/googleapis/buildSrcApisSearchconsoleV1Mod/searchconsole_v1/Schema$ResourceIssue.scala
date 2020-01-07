package typings.googleapis.buildSrcApisSearchconsoleV1Mod.searchconsole_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a resource with issue.
  */
@js.native
trait Schema$ResourceIssue extends js.Object {
  /**
    * Describes a blocked resource issue.
    */
  var blockedResource: js.UndefOr[Schema$BlockedResource] = js.native
}

object Schema$ResourceIssue {
  @scala.inline
  def apply(blockedResource: Schema$BlockedResource = null): Schema$ResourceIssue = {
    val __obj = js.Dynamic.literal()
    if (blockedResource != null) __obj.updateDynamic("blockedResource")(blockedResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceIssue]
  }
}

