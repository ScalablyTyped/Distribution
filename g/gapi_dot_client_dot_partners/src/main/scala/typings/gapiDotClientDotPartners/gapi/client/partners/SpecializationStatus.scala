package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecializationStatus extends js.Object {
  /** The specialization this status is for. */
  var badgeSpecialization: js.UndefOr[String] = js.undefined
  /** State of agency specialization. */
  var badgeSpecializationState: js.UndefOr[String] = js.undefined
}

object SpecializationStatus {
  @scala.inline
  def apply(badgeSpecialization: String = null, badgeSpecializationState: String = null): SpecializationStatus = {
    val __obj = js.Dynamic.literal()
    if (badgeSpecialization != null) __obj.updateDynamic("badgeSpecialization")(badgeSpecialization.asInstanceOf[js.Any])
    if (badgeSpecializationState != null) __obj.updateDynamic("badgeSpecializationState")(badgeSpecializationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecializationStatus]
  }
}

