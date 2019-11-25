package typings.expiredDashStorage.expiredDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeekInterface extends js.Object {
  /**
    * Has the [key] expired or not
    */
  var isExpired: Boolean
  /**
    * Time remaining until expiration
    */
  var timeLeft: Double | Null
  /**
    * The value of a [key]
    */
  var value: String | Null
}

object PeekInterface {
  @scala.inline
  def apply(isExpired: Boolean, timeLeft: Int | Double = null, value: String = null): PeekInterface = {
    val __obj = js.Dynamic.literal(isExpired = isExpired.asInstanceOf[js.Any])
    if (timeLeft != null) __obj.updateDynamic("timeLeft")(timeLeft.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeekInterface]
  }
}

