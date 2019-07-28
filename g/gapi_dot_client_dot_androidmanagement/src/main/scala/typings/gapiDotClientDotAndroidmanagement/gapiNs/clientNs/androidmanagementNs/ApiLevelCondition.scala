package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiLevelCondition extends js.Object {
  /**
    * The minimum desired Android Framework API level. If the device does not meet the minimum requirement, this condition is satisfied. Must be greater than
    * zero.
    */
  var minApiLevel: js.UndefOr[Double] = js.undefined
}

object ApiLevelCondition {
  @scala.inline
  def apply(minApiLevel: Int | Double = null): ApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    if (minApiLevel != null) __obj.updateDynamic("minApiLevel")(minApiLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiLevelCondition]
  }
}

