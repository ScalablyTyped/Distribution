package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  /** The usage limit, if applicable. This will not be present if the user has unlimited storage. */
  var limit: js.UndefOr[java.lang.String] = js.undefined
  /** The total usage across all services. */
  var usage: js.UndefOr[java.lang.String] = js.undefined
  /** The usage by all files in Google Drive. */
  var usageInDrive: js.UndefOr[java.lang.String] = js.undefined
  /** The usage by trashed files in Google Drive. */
  var usageInDriveTrash: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Limit {
  @scala.inline
  def apply(
    limit: java.lang.String = null,
    usage: java.lang.String = null,
    usageInDrive: java.lang.String = null,
    usageInDriveTrash: java.lang.String = null
  ): Anon_Limit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    if (usageInDrive != null) __obj.updateDynamic("usageInDrive")(usageInDrive)
    if (usageInDriveTrash != null) __obj.updateDynamic("usageInDriveTrash")(usageInDriveTrash)
    __obj.asInstanceOf[Anon_Limit]
  }
}

