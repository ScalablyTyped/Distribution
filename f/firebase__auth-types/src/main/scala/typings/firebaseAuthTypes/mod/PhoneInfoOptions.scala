package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions
  - typings.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions
  - typings.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions
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

