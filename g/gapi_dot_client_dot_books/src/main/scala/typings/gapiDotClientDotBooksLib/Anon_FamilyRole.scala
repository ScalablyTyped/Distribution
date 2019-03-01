package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyRole extends js.Object {
  /** The role of the user in the family. */
  var familyRole: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not this volume can be shared with the family by the user. This includes sharing eligibility of both the volume and the user. If the value
    * is true, the user can initiate a family sharing action.
    */
  var isSharingAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not sharing this volume is temporarily disabled due to issues with the Family Wallet. */
  var isSharingDisabledByFop: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FamilyRole {
  @scala.inline
  def apply(
    familyRole: java.lang.String = null,
    isSharingAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    isSharingDisabledByFop: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FamilyRole = {
    val __obj = js.Dynamic.literal()
    if (familyRole != null) __obj.updateDynamic("familyRole")(familyRole)
    if (!js.isUndefined(isSharingAllowed)) __obj.updateDynamic("isSharingAllowed")(isSharingAllowed)
    if (!js.isUndefined(isSharingDisabledByFop)) __obj.updateDynamic("isSharingDisabledByFop")(isSharingDisabledByFop)
    __obj.asInstanceOf[Anon_FamilyRole]
  }
}

