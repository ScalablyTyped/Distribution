package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamilyRole extends js.Object {
  /** The role of the user in the family. */
  var familyRole: js.UndefOr[String] = js.undefined
  /**
    * Whether or not this volume can be shared with the family by the user. This includes sharing eligibility of both the volume and the user. If the value
    * is true, the user can initiate a family sharing action.
    */
  var isSharingAllowed: js.UndefOr[Boolean] = js.undefined
  /** Whether or not sharing this volume is temporarily disabled due to issues with the Family Wallet. */
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
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

