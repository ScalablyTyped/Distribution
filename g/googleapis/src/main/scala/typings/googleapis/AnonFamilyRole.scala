package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFamilyRole extends js.Object {
  var familyRole: js.UndefOr[String] = js.native
  var isSharingAllowed: js.UndefOr[Boolean] = js.native
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.native
}

object AnonFamilyRole {
  @scala.inline
  def apply(
    familyRole: String = null,
    isSharingAllowed: js.UndefOr[Boolean] = js.undefined,
    isSharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
  ): AnonFamilyRole = {
    val __obj = js.Dynamic.literal()
    if (familyRole != null) __obj.updateDynamic("familyRole")(familyRole.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharingAllowed)) __obj.updateDynamic("isSharingAllowed")(isSharingAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharingDisabledByFop)) __obj.updateDynamic("isSharingDisabledByFop")(isSharingDisabledByFop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyRole]
  }
}

