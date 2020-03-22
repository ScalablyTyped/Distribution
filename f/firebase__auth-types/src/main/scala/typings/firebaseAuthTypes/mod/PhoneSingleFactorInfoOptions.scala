package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

