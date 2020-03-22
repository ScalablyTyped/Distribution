package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a phone specific user enrolled second factor
  * for an `UpdateRequest`.
  */
trait UpdatePhoneMultiFactorInfoRequest extends UpdateMultiFactorInfoRequest {
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}

object UpdatePhoneMultiFactorInfoRequest {
  @scala.inline
  def apply(
    factorId: String,
    phoneNumber: String,
    displayName: String = null,
    enrollmentTime: String = null,
    uid: String = null
  ): UpdatePhoneMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enrollmentTime != null) __obj.updateDynamic("enrollmentTime")(enrollmentTime.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneMultiFactorInfoRequest]
  }
}

