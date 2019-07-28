package typings.gapiDotClientDotVault.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldOrgUnit extends js.Object {
  /** When the org unit was put on hold. This property is immutable. */
  var holdTime: js.UndefOr[String] = js.undefined
  /** The org unit's immutable ID as provided by the admin SDK. */
  var orgUnitId: js.UndefOr[String] = js.undefined
}

object HeldOrgUnit {
  @scala.inline
  def apply(holdTime: String = null, orgUnitId: String = null): HeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    if (holdTime != null) __obj.updateDynamic("holdTime")(holdTime)
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId)
    __obj.asInstanceOf[HeldOrgUnit]
  }
}

