package typings.devextreme.anon

import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.smallValueThreshold
import typings.devextreme.devextremeStrings.topN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupName extends js.Object {
  var groupName: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[none | smallValueThreshold | topN] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var topCount: js.UndefOr[Double] = js.undefined
}

object GroupName {
  @scala.inline
  def apply(
    groupName: String = null,
    mode: none | smallValueThreshold | topN = null,
    threshold: js.UndefOr[Double] = js.undefined,
    topCount: js.UndefOr[Double] = js.undefined
  ): GroupName = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topCount)) __obj.updateDynamic("topCount")(topCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupName]
  }
}

