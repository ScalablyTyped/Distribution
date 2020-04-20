package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phone info options for multi-factor enrollment. Phone number and
  * multi-factor session are required.
  */
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

