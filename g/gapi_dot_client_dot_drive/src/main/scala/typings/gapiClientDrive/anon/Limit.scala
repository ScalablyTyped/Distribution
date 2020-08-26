package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  /** The usage limit, if applicable. This will not be present if the user has unlimited storage. */
  var limit: js.UndefOr[String] = js.native
  /** The total usage across all services. */
  var usage: js.UndefOr[String] = js.native
  /** The usage by all files in Google Drive. */
  var usageInDrive: js.UndefOr[String] = js.native
  /** The usage by trashed files in Google Drive. */
  var usageInDriveTrash: js.UndefOr[String] = js.native
}

object Limit {
  @scala.inline
  def apply(): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limit]
  }
  @scala.inline
  implicit class LimitOps[Self <: Limit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    @scala.inline
    def setUsageInDrive(value: String): Self = this.set("usageInDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageInDrive: Self = this.set("usageInDrive", js.undefined)
    @scala.inline
    def setUsageInDriveTrash(value: String): Self = this.set("usageInDriveTrash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageInDriveTrash: Self = this.set("usageInDriveTrash", js.undefined)
  }
  
}

