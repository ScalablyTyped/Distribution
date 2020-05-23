package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneMultiFactorInfo extends MultiFactorInfo {
  var phoneNumber: String
}

object PhoneMultiFactorInfo {
  @scala.inline
  def apply(
    enrollmentTime: String,
    factorId: String,
    phoneNumber: String,
    uid: String,
    displayName: js.UndefOr[Null | String] = js.undefined
  ): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
}

