package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certification extends js.Object {
  /** Whether this certification has been achieved. */
  var achieved: js.UndefOr[Boolean] = js.native
  /** The type of certification, the area of expertise. */
  var certificationType: js.UndefOr[String] = js.native
  /** Date this certification is due to expire. */
  var expiration: js.UndefOr[String] = js.native
  /** The date the user last achieved certification. */
  var lastAchieved: js.UndefOr[String] = js.native
  /** Whether this certification is in the state of warning. */
  var warning: js.UndefOr[Boolean] = js.native
}

object Certification {
  @scala.inline
  def apply(): Certification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certification]
  }
  @scala.inline
  implicit class CertificationOps[Self <: Certification] (val x: Self) extends AnyVal {
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
    def setAchieved(value: Boolean): Self = this.set("achieved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchieved: Self = this.set("achieved", js.undefined)
    @scala.inline
    def setCertificationType(value: String): Self = this.set("certificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificationType: Self = this.set("certificationType", js.undefined)
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setLastAchieved(value: String): Self = this.set("lastAchieved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAchieved: Self = this.set("lastAchieved", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

