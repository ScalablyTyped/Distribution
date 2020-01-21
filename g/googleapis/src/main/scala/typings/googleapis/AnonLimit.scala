package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLimit extends js.Object {
  var limit: js.UndefOr[String] = js.native
  var usage: js.UndefOr[String] = js.native
  var usageInDrive: js.UndefOr[String] = js.native
  var usageInDriveTrash: js.UndefOr[String] = js.native
}

object AnonLimit {
  @scala.inline
  def apply(
    limit: String = null,
    usage: String = null,
    usageInDrive: String = null,
    usageInDriveTrash: String = null
  ): AnonLimit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (usageInDrive != null) __obj.updateDynamic("usageInDrive")(usageInDrive.asInstanceOf[js.Any])
    if (usageInDriveTrash != null) __obj.updateDynamic("usageInDriveTrash")(usageInDriveTrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

