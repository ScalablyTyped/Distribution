package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FamilyRole extends js.Object {
  var familyRole: js.UndefOr[String] = js.native
  var isSharingAllowed: js.UndefOr[Boolean] = js.native
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.native
}

object FamilyRole {
  @scala.inline
  def apply(
    familyRole: String = null,
    isSharingAllowed: js.UndefOr[Boolean] = js.undefined,
    isSharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
  ): FamilyRole = {
    val __obj = js.Dynamic.literal()
    if (familyRole != null) __obj.updateDynamic("familyRole")(familyRole.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharingAllowed)) __obj.updateDynamic("isSharingAllowed")(isSharingAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharingDisabledByFop)) __obj.updateDynamic("isSharingDisabledByFop")(isSharingDisabledByFop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyRole]
  }
}

