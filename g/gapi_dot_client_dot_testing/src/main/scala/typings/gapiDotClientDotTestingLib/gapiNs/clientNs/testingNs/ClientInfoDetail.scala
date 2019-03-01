package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfoDetail extends js.Object {
  /**
    * The key of detailed client information.
    * Required
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of detailed client information.
    * Required
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ClientInfoDetail {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): ClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClientInfoDetail]
  }
}

