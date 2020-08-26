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
  def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
}

