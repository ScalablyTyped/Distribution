package typings.dingtalkDashRobotDashSender

import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.`0`
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var btnOrientation: `0` | `1`
  var btns: js.UndefOr[js.Array[Anon_ActionURL]] = js.undefined
  var hideAvatar: `0` | `1`
  var singleTitle: js.UndefOr[String] = js.undefined
  var singleURL: js.UndefOr[String] = js.undefined
  var text: String
  var title: String
}

object Anon_0 {
  @scala.inline
  def apply(
    btnOrientation: `0` | `1`,
    hideAvatar: `0` | `1`,
    text: String,
    title: String,
    btns: js.Array[Anon_ActionURL] = null,
    singleTitle: String = null,
    singleURL: String = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(btnOrientation = btnOrientation.asInstanceOf[js.Any], hideAvatar = hideAvatar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (btns != null) __obj.updateDynamic("btns")(btns.asInstanceOf[js.Any])
    if (singleTitle != null) __obj.updateDynamic("singleTitle")(singleTitle.asInstanceOf[js.Any])
    if (singleURL != null) __obj.updateDynamic("singleURL")(singleURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

