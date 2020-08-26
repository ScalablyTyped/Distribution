package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /** The creation date/time of the job. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The date/time when this job will expire/expired. After a job expired, no
    * new reports are generated.
    */
  var expireTime: js.UndefOr[String] = js.native
  /** The server-generated ID of the job (max. 40 characters). */
  var id: js.UndefOr[String] = js.native
  /** The name of the job (max. 100 characters). */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of reports this job creates. Corresponds to the ID of a
    * ReportType.
    */
  var reportTypeId: js.UndefOr[String] = js.native
  /**
    * True if this a system-managed job that cannot be modified by the user;
    * otherwise false.
    */
  var systemManaged: js.UndefOr[Boolean] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReportTypeId(value: String): Self = this.set("reportTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTypeId: Self = this.set("reportTypeId", js.undefined)
    @scala.inline
    def setSystemManaged(value: Boolean): Self = this.set("systemManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemManaged: Self = this.set("systemManaged", js.undefined)
  }
  
}

