package typings.expiredStorage.mod

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
  def apply(isExpired: Boolean, timeLeft: Double = null.asInstanceOf[Double], value: String = null): PeekInterface = {
    val __obj = js.Dynamic.literal(isExpired = isExpired.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeekInterface]
  }
}

