package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A organizational unit being held in a particular hold. This structure is
  * immutable.
  */
@js.native
trait Schema$HeldOrgUnit extends js.Object {
  /**
    * When the org unit was put on hold. This property is immutable.
    */
  var holdTime: js.UndefOr[String] = js.native
  /**
    * The org unit&#39;s immutable ID as provided by the Admin SDK.
    */
  var orgUnitId: js.UndefOr[String] = js.native
}

object Schema$HeldOrgUnit {
  @scala.inline
  def apply(holdTime: String = null, orgUnitId: String = null): Schema$HeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    if (holdTime != null) __obj.updateDynamic("holdTime")(holdTime.asInstanceOf[js.Any])
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HeldOrgUnit]
  }
}

