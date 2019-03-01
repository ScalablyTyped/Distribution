package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /** Key or name for this parameter. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Value for this parameter. */
  var value: js.UndefOr[js.Any] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(key: java.lang.String = null, value: js.Any = null): Parameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Parameter]
  }
}

