package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The subclass of the MultiFactorInfo interface for phone number second factors.
  * The factorId of this second factor is
  * {@link firebase.auth.PhoneMultiFactorGenerator.FACTOR_ID}.
  */
trait PhoneMultiFactorInfo extends MultiFactorInfo {
  /**
    * The phone number associated with the current second factor.
    */
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

