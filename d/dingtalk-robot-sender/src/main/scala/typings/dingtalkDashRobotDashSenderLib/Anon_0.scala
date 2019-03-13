package typings
package dingtalkDashRobotDashSenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var btnOrientation: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`0` | dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`1`
  var btns: js.UndefOr[js.Array[Anon_ActionURL]] = js.undefined
  var hideAvatar: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`0` | dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`1`
  var singleTitle: js.UndefOr[java.lang.String] = js.undefined
  var singleURL: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var title: java.lang.String
}

object Anon_0 {
  @scala.inline
  def apply(
    btnOrientation: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`0` | dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`1`,
    hideAvatar: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`0` | dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.`1`,
    text: java.lang.String,
    title: java.lang.String,
    btns: js.Array[Anon_ActionURL] = null,
    singleTitle: java.lang.String = null,
    singleURL: java.lang.String = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(btnOrientation = btnOrientation.asInstanceOf[js.Any], hideAvatar = hideAvatar.asInstanceOf[js.Any], text = text, title = title)
    if (btns != null) __obj.updateDynamic("btns")(btns)
    if (singleTitle != null) __obj.updateDynamic("singleTitle")(singleTitle)
    if (singleURL != null) __obj.updateDynamic("singleURL")(singleURL)
    __obj.asInstanceOf[Anon_0]
  }
}

