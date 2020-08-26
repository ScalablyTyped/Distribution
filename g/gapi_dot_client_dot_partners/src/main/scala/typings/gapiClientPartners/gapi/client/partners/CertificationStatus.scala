package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificationStatus extends js.Object {
  /** List of certification exam statuses. */
  var examStatuses: js.UndefOr[js.Array[CertificationExamStatus]] = js.native
  /** Whether certification is passing. */
  var isCertified: js.UndefOr[Boolean] = js.native
  /** The type of the certification. */
  var `type`: js.UndefOr[String] = js.native
  /** Number of people who are certified, */
  var userCount: js.UndefOr[Double] = js.native
}

object CertificationStatus {
  @scala.inline
  def apply(): CertificationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationStatus]
  }
  @scala.inline
  implicit class CertificationStatusOps[Self <: CertificationStatus] (val x: Self) extends AnyVal {
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
    def setExamStatusesVarargs(value: CertificationExamStatus*): Self = this.set("examStatuses", js.Array(value :_*))
    @scala.inline
    def setExamStatuses(value: js.Array[CertificationExamStatus]): Self = this.set("examStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamStatuses: Self = this.set("examStatuses", js.undefined)
    @scala.inline
    def setIsCertified(value: Boolean): Self = this.set("isCertified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCertified: Self = this.set("isCertified", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUserCount(value: Double): Self = this.set("userCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserCount: Self = this.set("userCount", js.undefined)
  }
  
}

