package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.AtMobiles
import typings.dingtalkRobotSender.anon.Content
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends MessageType {
  var at: js.UndefOr[AtMobiles] = js.undefined
  var msgtype: text
  var text: Content
}

object Text {
  @scala.inline
  def apply(msgtype: text, text: Content, at: AtMobiles = null): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

