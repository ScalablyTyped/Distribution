package typings
package expiredDashStorageLib.expiredDashStorageMod.ExpiredStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeekInterface extends js.Object {
  /**
    * Has the [key] expired or not
    */
  var isExpired: scala.Boolean
  /**
    * Time remaining until expiration
    */
  var timeLeft: scala.Double | scala.Null
  /**
    * The value of a [key]
    */
  var value: java.lang.String | scala.Null
}

object PeekInterface {
  @scala.inline
  def apply(
    isExpired: scala.Boolean,
    timeLeft: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): PeekInterface = {
    val __obj = js.Dynamic.literal(isExpired = isExpired)
    if (timeLeft != null) __obj.updateDynamic("timeLeft")(timeLeft.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PeekInterface]
  }
}

