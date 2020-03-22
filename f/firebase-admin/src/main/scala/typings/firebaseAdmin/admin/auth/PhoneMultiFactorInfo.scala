package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a phone specific user enrolled second factor.
  */
trait PhoneMultiFactorInfo extends MultiFactorInfo {
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}

object PhoneMultiFactorInfo {
  @scala.inline
  def apply(
    factorId: String,
    phoneNumber: String,
    toJSON: () => js.Object,
    uid: String,
    displayName: String = null,
    enrollmentTime: String = null
  ): PhoneMultiFactorInfo = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enrollmentTime != null) __obj.updateDynamic("enrollmentTime")(enrollmentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorInfo]
  }
}

