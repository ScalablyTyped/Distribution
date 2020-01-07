package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FamilyRole extends js.Object {
  var familyRole: js.UndefOr[String] = js.native
  var isSharingAllowed: js.UndefOr[Boolean] = js.native
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.native
}

object Anon_FamilyRole {
  @scala.inline
  def apply(
    familyRole: String = null,
    isSharingAllowed: js.UndefOr[Boolean] = js.undefined,
    isSharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
  ): Anon_FamilyRole = {
    val __obj = js.Dynamic.literal()
    if (familyRole != null) __obj.updateDynamic("familyRole")(familyRole.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharingAllowed)) __obj.updateDynamic("isSharingAllowed")(isSharingAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharingDisabledByFop)) __obj.updateDynamic("isSharingDisabledByFop")(isSharingDisabledByFop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FamilyRole]
  }
}

