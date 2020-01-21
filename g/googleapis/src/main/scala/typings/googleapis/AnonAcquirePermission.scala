package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcquirePermission extends js.Object {
  var acquirePermission: js.UndefOr[String] = js.native
  var ageGroup: js.UndefOr[String] = js.native
  var allowedMaturityRating: js.UndefOr[String] = js.native
  var isInFamily: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
}

object AnonAcquirePermission {
  @scala.inline
  def apply(
    acquirePermission: String = null,
    ageGroup: String = null,
    allowedMaturityRating: String = null,
    isInFamily: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): AnonAcquirePermission = {
    val __obj = js.Dynamic.literal()
    if (acquirePermission != null) __obj.updateDynamic("acquirePermission")(acquirePermission.asInstanceOf[js.Any])
    if (ageGroup != null) __obj.updateDynamic("ageGroup")(ageGroup.asInstanceOf[js.Any])
    if (allowedMaturityRating != null) __obj.updateDynamic("allowedMaturityRating")(allowedMaturityRating.asInstanceOf[js.Any])
    if (!js.isUndefined(isInFamily)) __obj.updateDynamic("isInFamily")(isInFamily.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcquirePermission]
  }
}

