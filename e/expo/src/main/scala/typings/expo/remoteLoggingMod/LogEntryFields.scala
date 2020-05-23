package typings.expo.remoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryFields extends js.Object {
  var groupCollapsed: js.UndefOr[Boolean] = js.undefined
  var groupDepth: js.UndefOr[Double] = js.undefined
  var shouldHide: js.UndefOr[Boolean] = js.undefined
}

object LogEntryFields {
  @scala.inline
  def apply(
    groupCollapsed: js.UndefOr[Boolean] = js.undefined,
    groupDepth: js.UndefOr[Double] = js.undefined,
    shouldHide: js.UndefOr[Boolean] = js.undefined
  ): LogEntryFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(groupCollapsed)) __obj.updateDynamic("groupCollapsed")(groupCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupDepth)) __obj.updateDynamic("groupDepth")(groupDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHide)) __obj.updateDynamic("shouldHide")(shouldHide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryFields]
  }
}

