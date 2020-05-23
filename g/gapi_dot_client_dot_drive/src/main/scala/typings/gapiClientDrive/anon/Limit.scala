package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  /** The usage limit, if applicable. This will not be present if the user has unlimited storage. */
  var limit: js.UndefOr[String] = js.undefined
  /** The total usage across all services. */
  var usage: js.UndefOr[String] = js.undefined
  /** The usage by all files in Google Drive. */
  var usageInDrive: js.UndefOr[String] = js.undefined
  /** The usage by trashed files in Google Drive. */
  var usageInDriveTrash: js.UndefOr[String] = js.undefined
}

object Limit {
  @scala.inline
  def apply(
    limit: String = null,
    usage: String = null,
    usageInDrive: String = null,
    usageInDriveTrash: String = null
  ): Limit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (usageInDrive != null) __obj.updateDynamic("usageInDrive")(usageInDrive.asInstanceOf[js.Any])
    if (usageInDriveTrash != null) __obj.updateDynamic("usageInDriveTrash")(usageInDriveTrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

