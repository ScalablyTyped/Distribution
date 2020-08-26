package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificationExamStatus extends js.Object {
  /** The number of people who have passed the certification exam. */
  var numberUsersPass: js.UndefOr[Double] = js.native
  /** The type of certification exam. */
  var `type`: js.UndefOr[String] = js.native
}

object CertificationExamStatus {
  @scala.inline
  def apply(): CertificationExamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationExamStatus]
  }
  @scala.inline
  implicit class CertificationExamStatusOps[Self <: CertificationExamStatus] (val x: Self) extends AnyVal {
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
    def setNumberUsersPass(value: Double): Self = this.set("numberUsersPass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberUsersPass: Self = this.set("numberUsersPass", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

