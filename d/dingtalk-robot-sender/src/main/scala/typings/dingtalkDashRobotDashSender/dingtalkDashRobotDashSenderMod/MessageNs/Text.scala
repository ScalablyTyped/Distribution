package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageNs

import typings.dingtalkDashRobotDashSender.Anon_AtMobiles
import typings.dingtalkDashRobotDashSender.Anon_Content
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends MessageType {
  var at: js.UndefOr[Anon_AtMobiles] = js.undefined
  var msgtype: text
  var text: Anon_Content
}

object Text {
  @scala.inline
  def apply(msgtype: text, text: Anon_Content, at: Anon_AtMobiles = null): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype, text = text)
    if (at != null) __obj.updateDynamic("at")(at)
    __obj.asInstanceOf[Text]
  }
}

