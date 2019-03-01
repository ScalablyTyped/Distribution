package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateFamilyConfig extends js.Object {
  /** If true, this family corresponds to a read operation. */
  var isRead: js.UndefOr[scala.Boolean] = js.undefined
  /** The state family value. */
  var stateFamily: js.UndefOr[java.lang.String] = js.undefined
}

object StateFamilyConfig {
  @scala.inline
  def apply(isRead: js.UndefOr[scala.Boolean] = js.undefined, stateFamily: java.lang.String = null): StateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isRead)) __obj.updateDynamic("isRead")(isRead)
    if (stateFamily != null) __obj.updateDynamic("stateFamily")(stateFamily)
    __obj.asInstanceOf[StateFamilyConfig]
  }
}

