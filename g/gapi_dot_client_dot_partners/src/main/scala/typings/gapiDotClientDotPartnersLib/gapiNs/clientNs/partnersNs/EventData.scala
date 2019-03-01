package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  /** Data type. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Data values. */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object EventData {
  @scala.inline
  def apply(key: java.lang.String = null, values: js.Array[java.lang.String] = null): EventData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[EventData]
  }
}

