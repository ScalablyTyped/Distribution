package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecializationStatus extends js.Object {
  /** The specialization this status is for. */
  var badgeSpecialization: js.UndefOr[java.lang.String] = js.undefined
  /** State of agency specialization. */
  var badgeSpecializationState: js.UndefOr[java.lang.String] = js.undefined
}

object SpecializationStatus {
  @scala.inline
  def apply(badgeSpecialization: java.lang.String = null, badgeSpecializationState: java.lang.String = null): SpecializationStatus = {
    val __obj = js.Dynamic.literal()
    if (badgeSpecialization != null) __obj.updateDynamic("badgeSpecialization")(badgeSpecialization)
    if (badgeSpecializationState != null) __obj.updateDynamic("badgeSpecializationState")(badgeSpecializationState)
    __obj.asInstanceOf[SpecializationStatus]
  }
}

