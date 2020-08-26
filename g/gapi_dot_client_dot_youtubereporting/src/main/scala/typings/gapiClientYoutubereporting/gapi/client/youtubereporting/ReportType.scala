package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportType extends js.Object {
  /** The date/time when this report type was/will be deprecated. */
  var deprecateTime: js.UndefOr[String] = js.native
  /** The ID of the report type (max. 100 characters). */
  var id: js.UndefOr[String] = js.native
  /** The name of the report type (max. 100 characters). */
  var name: js.UndefOr[String] = js.native
  /**
    * True if this a system-managed report type; otherwise false. Reporting jobs
    * for system-managed report types are created automatically and can thus not
    * be used in the `CreateJob` method.
    */
  var systemManaged: js.UndefOr[Boolean] = js.native
}

object ReportType {
  @scala.inline
  def apply(): ReportType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportType]
  }
  @scala.inline
  implicit class ReportTypeOps[Self <: ReportType] (val x: Self) extends AnyVal {
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
    def setDeprecateTime(value: String): Self = this.set("deprecateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecateTime: Self = this.set("deprecateTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSystemManaged(value: Boolean): Self = this.set("systemManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemManaged: Self = this.set("systemManaged", js.undefined)
  }
  
}

