package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var at: js.UndefOr[dingtalkDashRobotDashSenderLib.Anon_AtMobiles] = js.undefined
  var msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.text
  var text: dingtalkDashRobotDashSenderLib.Anon_Content
}

object Text {
  @scala.inline
  def apply(
    msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.text,
    text: dingtalkDashRobotDashSenderLib.Anon_Content,
    at: dingtalkDashRobotDashSenderLib.Anon_AtMobiles = null
  ): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype, text = text)
    if (at != null) __obj.updateDynamic("at")(at)
    __obj.asInstanceOf[Text]
  }
}

