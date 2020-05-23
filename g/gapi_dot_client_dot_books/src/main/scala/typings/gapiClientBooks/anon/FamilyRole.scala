package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FamilyRole extends js.Object {
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

