package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phone info options for single-factor sign-in. Only phone number is
  * required.
  */
trait PhoneSingleFactorInfoOptions extends PhoneInfoOptions {
  var phoneNumber: String
}

object PhoneSingleFactorInfoOptions {
  @scala.inline
  def apply(phoneNumber: String): PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhoneSingleFactorInfoOptions]
  }
}

