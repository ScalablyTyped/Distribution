package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldOrgUnit extends js.Object {
  /** When the org unit was put on hold. This property is immutable. */
  var holdTime: js.UndefOr[java.lang.String] = js.undefined
  /** The org unit's immutable ID as provided by the admin SDK. */
  var orgUnitId: js.UndefOr[java.lang.String] = js.undefined
}

object HeldOrgUnit {
  @scala.inline
  def apply(holdTime: java.lang.String = null, orgUnitId: java.lang.String = null): HeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    if (holdTime != null) __obj.updateDynamic("holdTime")(holdTime)
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId)
    __obj.asInstanceOf[HeldOrgUnit]
  }
}

