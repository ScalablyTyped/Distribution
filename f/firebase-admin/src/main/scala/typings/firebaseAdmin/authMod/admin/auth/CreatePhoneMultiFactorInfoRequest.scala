package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a phone specific user enrolled second factor for a
  * `CreateRequest`.
  */
trait CreatePhoneMultiFactorInfoRequest extends CreateMultiFactorInfoRequest {
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}

object CreatePhoneMultiFactorInfoRequest {
  @scala.inline
  def apply(factorId: String, phoneNumber: String, displayName: String = null): CreatePhoneMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneMultiFactorInfoRequest]
  }
}

