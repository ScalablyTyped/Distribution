package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

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
  def apply(minApiLevel: js.UndefOr[Double] = js.undefined): ApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minApiLevel)) __obj.updateDynamic("minApiLevel")(minApiLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiLevelCondition]
  }
}

