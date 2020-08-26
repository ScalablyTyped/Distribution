package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecializationStatus extends js.Object {
  /** The specialization this status is for. */
  var badgeSpecialization: js.UndefOr[String] = js.native
  /** State of agency specialization. */
  var badgeSpecializationState: js.UndefOr[String] = js.native
}

object SpecializationStatus {
  @scala.inline
  def apply(): SpecializationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecializationStatus]
  }
  @scala.inline
  implicit class SpecializationStatusOps[Self <: SpecializationStatus] (val x: Self) extends AnyVal {
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
    def setBadgeSpecialization(value: String): Self = this.set("badgeSpecialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeSpecialization: Self = this.set("badgeSpecialization", js.undefined)
    @scala.inline
    def setBadgeSpecializationState(value: String): Self = this.set("badgeSpecializationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeSpecializationState: Self = this.set("badgeSpecializationState", js.undefined)
  }
  
}

