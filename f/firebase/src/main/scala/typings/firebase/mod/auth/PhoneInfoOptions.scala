package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information required to verify the ownership of a phone number. The
  * information that's required depends on whether you are doing single-factor
  * sign-in, multi-factor enrollment or multi-factor sign-in.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebase.mod.auth.PhoneSingleFactorInfoOptions
  - typings.firebase.mod.auth.PhoneMultiFactorEnrollInfoOptions
  - typings.firebase.mod.auth.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends js.Object

object PhoneInfoOptions {
  @scala.inline
  def PhoneSingleFactorInfoOptions(phoneNumber: String): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
  @scala.inline
  def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
  @scala.inline
  def PhoneMultiFactorSignInInfoOptions(
    session: MultiFactorSession,
    multiFactorHint: MultiFactorInfo = null,
    multiFactorUid: String = null
  ): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    if (multiFactorHint != null) __obj.updateDynamic("multiFactorHint")(multiFactorHint.asInstanceOf[js.Any])
    if (multiFactorUid != null) __obj.updateDynamic("multiFactorUid")(multiFactorUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
}

