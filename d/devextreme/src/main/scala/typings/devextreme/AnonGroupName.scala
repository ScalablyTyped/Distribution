package typings.devextreme

import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.smallValueThreshold
import typings.devextreme.devextremeStrings.topN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupName extends js.Object {
  var groupName: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[none | smallValueThreshold | topN] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var topCount: js.UndefOr[Double] = js.undefined
}

object AnonGroupName {
  @scala.inline
  def apply(
    groupName: String = null,
    mode: none | smallValueThreshold | topN = null,
    threshold: Int | Double = null,
    topCount: Int | Double = null
  ): AnonGroupName = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (topCount != null) __obj.updateDynamic("topCount")(topCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupName]
  }
}

