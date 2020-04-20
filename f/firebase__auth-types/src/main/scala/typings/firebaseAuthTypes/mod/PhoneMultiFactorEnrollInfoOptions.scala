package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneMultiFactorEnrollInfoOptions extends PhoneInfoOptions {
  var phoneNumber: String
  var session: MultiFactorSession
}

object PhoneMultiFactorEnrollInfoOptions {
  @scala.inline
  def apply(phoneNumber: String, session: MultiFactorSession): PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorEnrollInfoOptions]
  }
}

