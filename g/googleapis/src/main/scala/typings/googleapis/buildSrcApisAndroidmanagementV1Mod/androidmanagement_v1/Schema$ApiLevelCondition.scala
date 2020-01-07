package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A compliance rule condition which is satisfied if the Android Framework API
  * level on the device doesn&#39;t meet a minimum requirement. There can only
  * be one rule with this type of condition per policy.
  */
@js.native
trait Schema$ApiLevelCondition extends js.Object {
  /**
    * The minimum desired Android Framework API level. If the device
    * doesn&#39;t meet the minimum requirement, this condition is satisfied.
    * Must be greater than zero.
    */
  var minApiLevel: js.UndefOr[Double] = js.native
}

object Schema$ApiLevelCondition {
  @scala.inline
  def apply(minApiLevel: Int | Double = null): Schema$ApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    if (minApiLevel != null) __obj.updateDynamic("minApiLevel")(minApiLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApiLevelCondition]
  }
}

