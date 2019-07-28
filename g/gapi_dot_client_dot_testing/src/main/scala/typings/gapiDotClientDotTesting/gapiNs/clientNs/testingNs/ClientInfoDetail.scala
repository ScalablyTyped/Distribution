package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfoDetail extends js.Object {
  /**
    * The key of detailed client information.
    * Required
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The value of detailed client information.
    * Required
    */
  var value: js.UndefOr[String] = js.undefined
}

object ClientInfoDetail {
  @scala.inline
  def apply(key: String = null, value: String = null): ClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClientInfoDetail]
  }
}

